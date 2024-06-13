package test1;

class Nine3{
    void output() {
        for(int i=1;i<=9;i++){
            for(int k=1;k<=9-i;k++){
                System.out.print("    ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+" "+"\t");
            }
            System.out.println("\t");
        }
    }
}
public class NineMultiplication3 {
    public static void main(String[] args) {
        Nine3 n3 = new Nine3();
        n3.output();
    }
}
