package Arrays.Medium;

public class Search2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int w = matrix[0].length;
        int h = matrix.length;
        for (int i = 0; i < h; i++) {
            if (matrix[i][w - 1] >= target) {
                int start = 0;
                int end = w - 1;
                while (start <= end) {
                    int mid = (start + end) / 2;
                    if (matrix[i][mid] == target || matrix[i][end] == target || matrix[i][start] == target) {
                        return true;
                    } else if (matrix[i][mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30,
        // 34, 60 } };
        int[][] matrix = new int[][] { { 1, 3 } };
        System.out.println(searchMatrix(matrix, 3));
    }

    // public static void main(String[] args) {
    // int[] matrix = new int[] { 1, 3, 5, 7, 23, 30, 34, 60, 71 };
    // System.out.println(searchMatrix(matrix, 5));
    // }
}
