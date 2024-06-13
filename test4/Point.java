package test4;

public class Point extends test2.Point {


    public Point() {
        super(0, 0);
    }

    public Point(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof test2.Point) {
            test2.Point p = (test2.Point) obj;
            return p.getX() == this.getX() && p.getY() == this.getY();
        }else
            return false;
    }

    @Override
    public String toString() {
        return "圆心坐标:" + "(" + getX() + "," + getY() + ")";
    }
}
