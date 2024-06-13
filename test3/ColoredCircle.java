package test3;

import test2.Circle;
import test2.Point;

public class ColoredCircle extends Circle {
    private Color borderColor;
    private Color centerColor;

    //圆心色彩默认构造方法
    public ColoredCircle() {
        super(0, 0, 0);
        borderColor = new Color(0, 0, 0);
        centerColor = new Color(0, 0, 0);
    }

    //获取圆心对象和半径的色彩构造方法
    public ColoredCircle(Point center, int radius) {
        super(center, radius);
        this.borderColor = new Color();
        this.centerColor = new Color();
    }

    //获取圆心和圆周色彩对象的构造方法
    public ColoredCircle(Color centerColor, Color borderColor) {
        super(0, 0, 0);
        if (centerColor == null || borderColor == null) {
            this.centerColor = new Color();
            this.borderColor = new Color();
            return;
        }
        this.centerColor = centerColor;
        this.borderColor = borderColor;
    }

    //获取圆心,半径,圆心和圆周色彩对象的构造方法
    public ColoredCircle(Point center, int radius, Color centerColor, Color borderColor) {
        super(center, radius);
        this.centerColor = centerColor;
        this.borderColor = borderColor;
    }

    //获取色彩对象设置圆心色彩方法
    public void setCenterColor(Color c) {
        if (c == null) {
            return;
        }
        this.centerColor = c;
    }

    //获取色彩对象设置圆周色彩方法
    public void setBorderColor(Color c) {
        if (c == null) {
            return;
        }
        this.borderColor = c;
    }

    //获取圆心色彩
    public Color getCenterColor() {
        return centerColor;
    }

    //获取圆周色彩
    public Color getBorderColor() {
        return borderColor;
    }

    //重写Circle的relation方法
    public int relation(Circle c) {
        int i = super.relation(c);
        if (c instanceof ColoredCircle) {
            ColoredCircle a = (ColoredCircle) c;
            if (i == 0) {
                if (this.borderColor.getRed() == a.borderColor.getRed() && this.borderColor.getGreen() == a.borderColor.getGreen() && this.borderColor.getBlue() == a.borderColor.getBlue()) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return i;
            }
        } else {
            if (i == 0) {
                return 1;
            } else {
                return i;
            }
        }
    }
}