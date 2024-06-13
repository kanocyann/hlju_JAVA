package test2;

public class Point{
    private int x;
    private int y;

    //默认构造方法
    public Point(){
        x = 0;
        y = 0;
    }

    //传入空对象的构造方法
    public Point(Point a) {
        if (a == null) {
            this.x = 0;
            this.y = 0;
            return;
        }
        this.x = a.getX();
        this.y = a.getY();
    }

    //自定义构造方法,将终端获取的值赋值给成员变量
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    //获取变量的值,进行计算
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    //设置变量的值,与构造方法同理,但是每次只赋值一个变量,方便调控
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    //传入p2,用p1的返回值和p2的成员变量计算距离
    public double distance(Point p){
        int dx = p.getX()-x;
        int dy = p.getY()-y;
        return Math.sqrt(dx*dx+dy*dy);
    }

}
