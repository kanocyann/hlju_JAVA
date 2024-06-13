package test4;

public class Circle extends test2.Circle {


    public Circle() {
        super(0, 0, 0);
    }

    public Circle(int x, int y, int r) {
        super(x, y, r);
    }

    public Circle(test2.Point c, int r) {
        super(c, r);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof test2.Circle) {
            test2.Circle c = (test2.Circle) obj;
                return this.getRadius() == c.getRadius() && this.getCenter().getX() == c.getCenter().getX() && this.getCenter().getY() == c.getCenter().getY();
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "圆心坐标:" + "(" + super.getCenter().getX() + "," + super.getCenter().getY() + ")" + "  " + "半径" + super.getRadius();
    }
}


