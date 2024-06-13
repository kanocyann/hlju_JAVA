package test2;

public class Test {
    public static void main(String[] args) {

        System.out.println("-------------1--------------");
        Point P1 = new Point();
        Point P2 = new Point(0, 3);
        System.out.println(P1.getX());
        System.out.println(P1.getY());
        System.out.println(P2.getX());
        System.out.println(P2.getY());
        System.out.println(P1.distance(P2));

        System.out.println("-------------2--------------");
        Circle C1 = new Circle();
        System.out.println("圆心" + "(" + C1.getCenter().getX() + "," + C1.getCenter().getY() + ")" + " " + "半径" + C1.getRadius());
        System.out.println("周长为:" + C1.perimeter() + " " + "面积为:" + C1.area());

        System.out.println("-------------3--------------");
        Circle C2 = new Circle(1, 1, 10);
        System.out.println("圆心" + "(" + C2.getCenter().getX() + "," + C2.getCenter().getY() + ")" + " " + "半径" + C2.getRadius());
        System.out.println("周长为:" + C2.perimeter() + " " + "面积为:" + C2.area());

        System.out.println("-------------4--------------");
        Circle C3 = new Circle(1, 1, -1);
        System.out.println("圆心" + "(" + C3.getCenter().getX() + "," + C3.getCenter().getY() + ")" + " " + "半径" + C3.getRadius());
        System.out.println("周长为:" + C3.perimeter() + " " + "面积为:" + C3.area());

        System.out.println("-------------5--------------");
        Point P = new Point(1, 1);
        Circle C4 = new Circle(P, 10);
        System.out.println("圆心" + "(" + C4.getCenter().getX() + "," + C4.getCenter().getY() + ")" + " " + "半径" + C4.getRadius());
        System.out.println("周长为:" + C4.perimeter() + " " + "面积为:" + C4.area());

        System.out.println("-------------6--------------");
        Circle C5 = new Circle(P, -1);
        System.out.println("圆心" + "(" + C5.getCenter().getX() + "," + C5.getCenter().getY() + ")" + " " + "半径" + C5.getRadius());
        System.out.println("周长为:" + C5.perimeter() + " " + "面积为:" + C5.area());

        System.out.println("-------------7--------------");
        Circle C6 = new Circle(null, 10);
        System.out.println("圆心" + "(" + C6.getCenter().getX() + "," + C6.getCenter().getY() + ")" + " " + "半径" + C6.getRadius());
        System.out.println("周长为:" + C6.perimeter() + " " + "面积为:" + C6.area());

        System.out.println("-------------8--------------");
        Point p = new Point();
        p.setX(10);
        p.setY(10);
        System.out.println("p点坐标:" + "(" + p.getX() + "," + p.getY() + ")");

        System.out.println("-------------9--------------");
        Circle c = new Circle();
        c.setRadius(20);
        System.out.println(c.getRadius());

        System.out.println("-------------10--------------");
        c.setRadius(-20);
        System.out.println(c.getRadius());

        System.out.println("-------------11--------------");
        c.setCenter(new Point(20, 20));
        System.out.println("(" + c.getCenter().getX() + "," + c.getCenter().getY() + ")");

        System.out.println("-------------12--------------");
        c.setCenter(null);
        System.out.println("(" + c.getCenter().getX() + "," + c.getCenter().getY() + ")");

        System.out.println("-------------13--------------");
        Circle C7 = new Circle();
        Circle C8 = new Circle(0, 0, 0);
        int a = C7.relation(C8);
        select(a);

        System.out.println("-------------14--------------");
        Circle C9 = new Circle();
        Circle C10 = new Circle(0, 0, 1);
        int b = C9.relation(C10);
        select(b);

        System.out.println("-------------15--------------");
        Circle C11 = new Circle(0, 0, 10);
        Circle C12 = new Circle(1, 1, 5);
        int d = C11.relation(C12);
        select(d);

        System.out.println("-------------16--------------");
        Circle C13 = new Circle(0, 0, 10);
        Circle C14 = new Circle(0, 5, 10);
        int e = C13.relation(C14);
        select(e);

        System.out.println("-------------17--------------");
        Circle C15 = new Circle(0, 0, 10);
        Circle C16 = new Circle(0, 20, 10);
        int f = C15.relation(C16);
        select(f);
    }

    public static void select(int e) {
        test4.Test.select(e);
    }
}