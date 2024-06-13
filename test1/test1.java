package test1;
import java.util.Scanner;

class FactoricalTest {
    long sum=1;
    long Factorial(int n){
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }
}
public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(n<0 || n>20){
            System.out.println("Invalid number");
            return;
        }
        FactoricalTest ft = new FactoricalTest();
        System.out.println("Factorial of "+n+" is "+ft.Factorial(n));
    }
}
