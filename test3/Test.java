package test3;

import test2.Circle;
import test2.Point;

public class Test {
    public static void main(String[] args) {
        System.out.println("--------1-----------");
        Point p = new Point();
        Circle c = new Circle();
        //p.x;p.y;c.center;c.radius;

        System.out.println("--------2-----------");
        Color c1 = new Color();
        System.out.println(c1.getRed());
        System.out.println(c1.getGreen());
        System.out.println(c1.getBlue());

        System.out.println("--------3-----------");
        Color c2 = new Color(255, 255, 255);
        System.out.println(c2.getRed());
        System.out.println(c2.getGreen());
        System.out.println(c2.getBlue());

        System.out.println("--------4-----------");
        Color c3 = new Color(355, 355, 355);
        System.out.println(c3.getRed());
        System.out.println(c3.getGreen());
        System.out.println(c3.getBlue());

        System.out.println("--------5-----------");
        Color c5 = new Color();
        c5.setRed(355);
        c5.setGreen(355);
        c5.setBlue(355);
        System.out.println(c5.getRed());
        System.out.println(c5.getGreen());
        System.out.println(c5.getBlue());

        System.out.println("--------6-1-----------");
        ColoredCircle c6 = new ColoredCircle();
        System.out.println(c6.getRadius());
        System.out.println(c6.area());
        System.out.println(c6.perimeter());
        System.out.println(c6.getCenter().getX());
        System.out.println(c6.getCenter().getY());
        System.out.println(c6.getBorderColor().getRed());
        System.out.println(c6.getCenterColor().getRed());
        System.out.println("--------6-2-----------");
        ColoredCircle c7 = new ColoredCircle(null, -1);
        System.out.println(c7.getRadius());
        System.out.println(c7.area());
        System.out.println(c7.perimeter());
        System.out.println(c7.getCenter().getX());
        System.out.println(c7.getCenter().getY());
        System.out.println(c7.getBorderColor().getRed());
        System.out.println(c7.getCenterColor().getRed());
        System.out.println("--------6-3-----------");
        ColoredCircle c8 = new ColoredCircle(null, null);
        System.out.println(c8.getRadius());
        System.out.println(c8.area());
        System.out.println(c8.perimeter());
        System.out.println(c8.getCenter().getX());
        System.out.println(c8.getCenter().getY());
        System.out.println(c8.getBorderColor().getRed());
        System.out.println(c8.getCenterColor().getRed());

        System.out.println("--------7-----------");
        ColoredCircle c9 = new ColoredCircle(new Point(0, 0), 10);
        System.out.println(c9.getRadius());
        System.out.println(c9.area());
        System.out.println(c9.perimeter());
        System.out.println(c9.getCenter().getX());
        System.out.println(c9.getCenter().getY());
        System.out.println(c9.getBorderColor().getRed());
        System.out.println(c9.getCenterColor().getRed());

        System.out.println("--------8-----------");
        ColoredCircle c10 = new ColoredCircle(new Color(0, 0, 0), new Color(1, 1, 1));
        System.out.println(c10.getRadius());
        System.out.println(c10.area());
        System.out.println(c10.perimeter());
        System.out.println(c10.getCenter().getX());
        System.out.println(c10.getCenter().getY());
        System.out.println(c10.getCenterColor().getRed() + " " + c10.getCenterColor().getBlue() + " " + c10.getCenterColor().getGreen());
        System.out.println(c10.getBorderColor().getRed() + " " + c10.getBorderColor().getBlue() + " " + c10.getBorderColor().getGreen());

        System.out.println("--------9-----------");
        Point center = new Point(1, 1);
        int radius = 10;
        Color centerColor = new Color(0, 0, 0);
        Color borderColor = new Color(1, 1, 1);
        ColoredCircle c11 = new ColoredCircle(center, radius, centerColor, borderColor);
        System.out.println(c11.getRadius());
        System.out.println(c11.area());
        System.out.println(c11.perimeter());
        System.out.println(c11.getCenter().getX());
        System.out.println(c11.getCenter().getY());
        System.out.println(c11.getCenterColor().getRed() + " " + c11.getCenterColor().getBlue() + " " + c11.getCenterColor().getGreen());
        System.out.println(c11.getBorderColor().getRed() + " " + c11.getBorderColor().getBlue() + " " + c11.getBorderColor().getGreen());

        System.out.println("--------10-----------");
        center = new Point(null);
        radius = -10;
        centerColor = new Color(null);
        borderColor = new Color(null);
        ColoredCircle c12 = new ColoredCircle(center, radius, centerColor, borderColor);
        System.out.println(c12.getRadius());
        System.out.println(c12.area());
        System.out.println(c12.perimeter());
        System.out.println(c12.getCenter().getX());
        System.out.println(c12.getCenter().getY());
        System.out.println(c12.getCenterColor().getRed() + " " + c12.getCenterColor().getBlue() + " " + c12.getCenterColor().getGreen());
        System.out.println(c12.getBorderColor().getRed() + " " + c12.getBorderColor().getBlue() + " " + c12.getBorderColor().getGreen());

        System.out.println("--------11-----------");
        Color c13 = new Color(12, 12, 12);
        Color c14 = new Color(13, 13, 13);
        ColoredCircle c15 = new ColoredCircle(c13, c14);
        c15.setCenterColor(null);
        System.out.println(c15.getCenterColor().getRed() + " " + c15.getCenterColor().getGreen() + " " + c15.getCenterColor().getBlue());

        System.out.println("--------12-----------");
        c15.setBorderColor(null);
        System.out.println(c15.getBorderColor().getRed() + " " + c15.getBorderColor().getGreen() + " " + c15.getBorderColor().getBlue());

        System.out.println("--------13-----------");
        Circle c16 = new Circle();
        ColoredCircle c17 = new ColoredCircle();
        int a = c17.relation(c16);
        test2.Test.select(a);

        System.out.println("--------14-----------");
        ColoredCircle c18 = new ColoredCircle();
        ColoredCircle c19 = new ColoredCircle();
        int b = c19.relation(c18);
        test2.Test.select(b);

        System.out.println("--------15-----------");
        centerColor = new Color(1, 1, 1);
        borderColor = new Color(1, 1, 1);
        ColoredCircle c20 = new ColoredCircle(centerColor, borderColor);
        ColoredCircle c21 = new ColoredCircle();
        int d = c21.relation(c20);
        test2.Test.select(d);
    }
}