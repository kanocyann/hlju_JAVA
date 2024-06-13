package test4;

public class Test {
    public static void main(String[] args) {
        System.out.println("--------------1-------------------");
        Point p = new Point();
        Circle c = new Circle();
        //int x = p.x;

        System.out.println("--------------2-------------------");
        test4.Point p1 = new test4.Point();
        test4.Point p2 = new test4.Point(0, 10);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.distance(p2));

        System.out.println("--------------3-------------------");
        test4.Circle c1 = new test4.Circle();
        test4.Circle c2 = new test4.Circle(0, 0, 10);
        System.out.println(c1.getCenter().getX());
        System.out.println(c1.getCenter().getY());
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        int a = c1.relation(c2);
        select(a);

        System.out.println("--------------4-------------------");
        System.out.println(p1.toString());

        System.out.println("--------------5-------------------");
        System.out.println(c1.toString());

        System.out.println("--------------6-------------------");
        test4.Point p3 = new test4.Point();
        test4.Point p4 = new Point(0, 10);
        System.out.println(p3.equals(p4));

        System.out.println("--------------7-------------------");
        test4.Point p5 = new test4.Point();
        test4.Point p6 = new test4.Point(0, 0);
        System.out.println(p5.equals(p6));

        System.out.println("--------------8-------------------");
        test4.Point p7 = new test4.Point();
        test2.Point p8 = new test2.Point();
        System.out.println(p7.equals(p8));

        System.out.println("--------------9-------------------");
        test4.Point p9 = new test4.Point();
        test2.Point p10 = new test2.Point(0, 0);
        System.out.println(p10.equals(p9));

        System.out.println("--------------10-------------------");
        test4.Circle c3 = new test4.Circle();
        test4.Circle c4 = new test4.Circle(0, 0, 10);
        System.out.println(c3.equals(c4));

        System.out.println("--------------11-------------------");
        test4.Circle c5 = new test4.Circle();
        test4.Circle c6 = new Circle(0, 0, 0);
        System.out.println(c5.equals(c6));

        System.out.println("--------------12-------------------");
        test4.Circle c7 = new test4.Circle();
        test4.Point p11 = new test4.Point(0, 0);
        test4.Circle c8 = new test4.Circle(p11, 0);
        System.out.println(c7.equals(c8));
        System.out.println(c7.equals(p11));
        System.out.println(p11.equals(c7));

        System.out.println("--------------13-------------------");
        test4.Circle c9 = new test4.Circle();
        test2.Point p12 = new test2.Point(0, 0);
        test4.Circle c10 = new test4.Circle(p12, 0);
        System.out.println(c9.equals(c10));

        System.out.println("--------------14-------------------");
        test4.Circle c11 = new test4.Circle();
        test2.Circle c12 = new test2.Circle(0, 0, 0);
        System.out.println(c11.equals(c12));
        System.out.println(c12.equals(c11));
    }

    public static void select(int a) {
        if (a == 0) {
            System.out.println("同一个圆");
        } else if (a == 1) {
            System.out.println("同心圆");
        } else if (a == 2) {
            System.out.println("相交的圆");
        } else if (a == 3) {
            System.out.println("分离的圆");
        } else if (a == 4) {
            System.out.println("包含的圆");
        }
    }

}