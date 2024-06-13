package test1;

class Nine1{
    void output(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+" "+"\t");
            }
            System.out.println("\t");
        }
    }
}

public class NineMultiplication1 {
    public static void main(String[] args) {
        Nine1 n1 = new Nine1();
        n1.output();
    }
}
