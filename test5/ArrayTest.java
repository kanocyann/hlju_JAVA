package test5;

import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = ran.nextInt(100) + 1;
        }
        ArrayReverser a1 = new ArrayReverser(a);
        System.out.println(a1.toString());
        a1.reverse();
        System.out.println(a1.toString());
    }
}
