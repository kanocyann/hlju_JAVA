package test5;

import java.util.Arrays;

public class ArrayReverser {
    private int[] data;

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        if (data == null) {
            return;
        }
        this.data = data;
    }

    public ArrayReverser() {
        this.data = new int[0];
    }

    public ArrayReverser(int[] data) {
        if (data == null) {
            this.data = new int[0];
        } else
            this.data = data;
    }

    public void reverse() {
        for (int i = 0; i < data.length / 2; i++) {
            int temp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
