package Arrays.Medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (Integer integer : col) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][integer] = 0;
            }
        }
        for (Integer integer : row) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[integer][i] = 0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 }
        };
        setZeroes(matrix);
    }
}
