package test5;

import java.util.Arrays;

public class Matrix {
    private double[][] data;

    public Matrix() {
        this.data = new double[0][0];
    }

    public Matrix(int rows, int cols) throws IllegalArgumentException {
        if (rows >= 1 && cols >= 1) {
            data = new double[rows][cols];
        } else {
            throw (new IllegalArgumentException("行数列数必须大于0"));
        }
    }

    public Matrix(double[][] data) throws IllegalArgumentException {
        if (data == null) {
            throw (new IllegalArgumentException("参数不能为空"));
        } else {
            this.data = data;
        }
    }

    public int getRows() {
        return data.length;
    }

    public int getCols() {
        return data[0].length;
    }

    public double getData(int row, int col) throws IllegalIndexException {
        if (row < 0 || row >= this.getRows()) {
            throw (new IllegalIndexException("行数<0,行号>=行数"));
        }
        if (col < 0 || col >= this.getCols()){
            throw (new IllegalIndexException("列数>0,列号>=列数"));
        }
        return data[row][col];
    }

    public void setData(int row, int col, double value) throws IllegalIndexException {
        if (row < 0 || row >= this.getRows()) {
            throw (new IllegalIndexException("行数<0,行号>=行数"));
        }
        if (col < 0 || col >= this.getCols()){
            throw (new IllegalIndexException("列数>0,列号>=列数"));
        }
        data[row][col] = value;
    }

    public Matrix multiply(Matrix m) throws MatrixMultiplication, IllegalArgumentException {
        if (m == null || data[0].length != m.data.length) {
            throw (new MatrixMultiplication());
        }
        int s = this.data.length;
        int t = m.data[0].length;
        Matrix mat = new Matrix(s,t);
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < t; j++) {
                for (int k = 0; k < m.data.length; k++) {
                    mat.data[i][j] += this.data[i][k] * m.data[k][j];
                }
            }
        }
        return mat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof Matrix) {
            Matrix mar = (Matrix) o;
            return this.data.length == mar.data.length && this.data[0].length == mar.data[0].length && Arrays.equals(data, mar.data);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] datum : data) {
            for (int j = 0; j < data[0].length; j++) {
                sb.append(datum[j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
/*
    1.可以添加矩阵加,减,数乘,转置等方法
    2.数据冗余：行数和列数的信息可以通过读取该结构的长度来获得行数和列数。因此，行数和列数作为单独的成员变量会导致信息重复，增加了数据冗余。
      一致性维护：如果行数和列数作为独立成员变量，当矩阵的大小发生变化（例如增加或删除行/列）时，需要确保这些成员变量也得到相应的更新。如果忘记更新行数或列数，就会导致矩阵数据和行列数信息不一致，可能引发错误。
      内存效率：每增加一个成员变量都会占用额外的内存空间。对于一个大型矩阵类来说，避免不必要的成员变量可以节省内存，提高程序的运行效率。
      简化代码：减少不必要的成员变量可以使代码更简洁，更易于维护和理解。开发者在操作矩阵时只需关注矩阵的核心数据结构，而不必额外处理行数和列数的更新。
    3.确定性与可预测性：当创建一个矩阵对象时，通常希望矩阵的内容是可预测的和确定的。使用随机数生成矩阵的数据会导致每次创建对象时内容不同，这不符合大多数情况下对矩阵的需求。矩阵的内容应该是明确指定的，或者从某个明确的来源（如文件、用户输入、计算结果等）获得的。
      测试和调试：如果矩阵数据是随机生成的，会导致测试和调试变得困难。固定的输入数据有助于重现问题并进行调试。而随机数据会让问题的重现变得困难，因为每次运行程序时数据都不同，问题可能出现或消失的情况难以预料。
      用途不明确：矩阵的用途多种多样，可能用于数学运算、数据存储、图像处理等。如果矩阵的数据是随机生成的，那么很难满足具体应用的需求。通常在实际应用中，矩阵的数据有特定的含义和结构，随机数据可能无法满足这些要求。
      灵活性和可配置性：构造方法应该提供一个灵活的接口来初始化矩阵，而不是硬编码成某种特定的数据生成方式（如随机数）。通过传递明确的数据或配置参数，可以让用户根据实际需要初始化矩阵。
*/
