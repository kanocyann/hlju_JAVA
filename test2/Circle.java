package test2;

import java.lang.Math.*;

public class Circle {
    private Point center;
    private int radius;

    //默认构造方法
    public Circle(){
        this.center = new Point();
        this.radius = 0;
    }

    //获取所有数据的构造方法
    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = Math.max(r, 0);
    }

    //获取点对象和半径的构造方法
    protected Circle(Point c, int r) {
        if (c == null) {
            center = new Point();
        } else {
            center = c;
        }
        radius = Math.max(r, 0);
    }

    //设置圆的半径
    public void setRadius(int radius) {
        this.radius = radius;
    }

    //获取圆的半径
    public int getRadius() {
        return radius;
    }

    //设置圆心的方法
    public void setCenter(Point center) {
        if (center == null) {
            this.center = new Point();
        } else {
            this.center = center;
        }
    }

    public Point getCenter() {
        return center;
    }

    //计算圆的周长
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    //计算圆的面积
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    //返回两个圆关系的方法
    public int relation(Circle c) {

        if ((this.center.getX() == c.center.getX()) && (this.center.getY() == c.center.getY()) && (radius == c.radius)) {
            return 0;
        } else if ((this.center.getX() == c.center.getX()) && (this.center.getY() == c.center.getY())) {
            return 1;
        } else if ((c.center.distance(this.center) < this.radius + c.radius) && (c.center.distance(this.center) > Math.abs(this.radius - c.radius))) {
            return 2;
        } else if ((this.center != c.center) && (c.center.distance(this.center) >= (this.radius + c.radius))) {
            return 3;
        } else if ((this.center != c.center) && (c.center.distance(this.center)) <= Math.abs(this.radius - c.radius)) {
            return 4;
        }
        return -1;
    }

}
