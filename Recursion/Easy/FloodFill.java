package Recursion.Easy;

public class FloodFill {
    public static void helper(int[][] image, int sr, int sc, int color, int p) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] == color
                || image[sr][sc] != p) { // Base case
            return;
        }
        image[sr][sc] = color;
        helper(image, sr, sc - 1, color, p);//
        helper(image, sr - 1, sc, color, p);//
        helper(image, sr + 1, sc, color, p);//
        helper(image, sr, sc + 1, color, p);//
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // if (image[sr][sc] == color)
        // return image;
        helper(image, sr, sc, color, image[sc][sr]);
        return image;
    }

    public static void main(String[] args) {
        int[][] image = { { 0, 0, 0 }, { 0, 0, 0 } };
        for (int[] is : floodFill(image, 0, 0, 0)) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }
    }
}
