package test1;

class Nine2{
    void output(){
        for(int i=1;i<=9;i++){
            for(int j=i;j<=9;j++){
                System.out.printf("%d*%d=%2d  ", i, j, j * i);
            }
            System.out.println();
            for(int k=1;k<=i;k++) {
                System.out.print("     " + "\t");
            }
        }
    }
}

public class NineMultiplication2 {
    public static void main(String[] args) {
        Nine2 n3 = new Nine2();
        n3.output();
    }
}
