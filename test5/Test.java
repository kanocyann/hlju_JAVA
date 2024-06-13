package test5;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IllegalIndexException, IllegalArgumentException, MatrixMultiplication, java.lang.IllegalArgumentException {
        Random r = new Random();
        System.out.println("----------第一个测试---------");
        ArrayReverser arr = new ArrayReverser(null);
        System.out.println(arr.getData().length);

        System.out.println("----------第二个测试---------");
        int[] data = {12, 23, 34};
        ArrayReverser ar = new ArrayReverser(data);
        System.out.println("ArrayReverse的数组内容是" + ar);
        System.out.println("getData的数组内容是" + Arrays.toString(data));

        System.out.println("----------第三个测试---------");
        ar.setData(null);
        System.out.println(ar + "内容不变");

        System.out.println("----------第四个测试---------");
        int[] data2 = {65, 34, 7, 5, 1, 6, 3};
        ar.setData(data2);
        System.out.println(ar + "内容被替换" + "   数组长度为" + ar.getData().length);

        System.out.println("----------第五个测试---------");
        ar.reverse();
        System.out.println(ar + "内容被反转");

        System.out.println("----------第六个测试---------");
        System.out.println(ar.toString());

        System.out.println("----------第七个测试---------");
        Matrix mar = new Matrix(2, 3);
        System.out.println("矩阵为");
        System.out.println(mar);

        System.out.println("----------第八个测试---------");
        double[][] data3 = {{4, 8, 3, 5}, {6, 5, 2, 7}, {9, 5, 7, 3}, {8, 4, 6, 2}};
        mar = new Matrix(data3);
        System.out.println(mar);

        System.out.println("----------第九个测试---------");
        try {
            mar = new Matrix(0, 3);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println("----------第十个测试---------");
        try {
            mar = new Matrix(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println("----------第十一个测试---------");
        Matrix mar1 = new Matrix(2, 1);
        System.out.println(mar1.getCols());

        System.out.println("----------第十二个测试---------");
        System.out.println(mar1.getRows());

        System.out.println("----------第十三个测试---------");
        System.out.println(mar1.getData(0, 0));

        System.out.println("----------第十四个测试---------");
        mar1.setData(0, 0, 10);
        System.out.println(mar1.getData(0, 0));

        System.out.println("----------第十五个测试---------");
        try {
            Matrix mar2 = new Matrix(1, 1);
            System.out.println(mar2.getData(-1, 0));
            System.out.println(mar2.getData(mar2.getRows(), 0));
        } catch (IllegalIndexException e) {
            System.out.println(e);
        }

        System.out.println("----------第十六个测试---------");
        try {
            Matrix mar2 = new Matrix(3, 3);
            int i = r.nextInt(10) + 1;
            mar2.setData(0, -1, i);
        } catch (IllegalIndexException e) {
            System.out.println(e);
        }

        System.out.println("----------第十七个测试---------");
        double[][] arr2 = {{1, 2}, {3, 4}};
        Matrix m1 = new Matrix(arr2);
        double[][] arr3 = {{1, 3}, {2, 3}};
        Matrix m2 = new Matrix(arr3);
        Matrix multiply = m1.multiply(m2);
        System.out.println("m1 * m2 = " + multiply);

        System.out.println("----------第十八个测试---------");
        try {
            System.out.println(m1.multiply(null));
        } catch (MatrixMultiplication e) {
            System.out.println(e);
        }

        System.out.println("----------第十九个测试---------");
        double[][] arr4 = {{1, 3}, {2, 5}, {7, 3}};
        m2 = new Matrix(arr4);
        try {
            System.out.println(m1.multiply(m2));
        } catch (MatrixMultiplication e) {
            System.out.println(e);
        }

        System.out.println("----------第二十个测试---------");
        System.out.println(m1.toString());
    }
}
