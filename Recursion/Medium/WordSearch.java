public class WordSearch {
    public static boolean helper(char[][] board, char[][] clone, int sr, int sc, String word, int index) {
        if (sr < 0 || sr >= board.length || sc < 0 || sc >= board[0].length || board[sr][sc] != word.charAt(index)
                || clone[sr][sc] == '0') {
            return false;
        }
        if (board[sr][sc] == word.charAt(index)) {
            clone[sr][sc] = '0';
            if (index == word.length() - 1) {
                return true;
            } else if (helper(board, clone, sr + 1, sc, word, index + 1) ||
                    helper(board, clone, sr, sc + 1, word, index + 1) ||
                    helper(board, clone, sr, sc - 1, word, index + 1) ||
                    helper(board, clone, sr - 1, sc, word, index + 1))
                return true;
            else
                clone[sr][sc] = word.charAt(index);

        }
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        int sc;
        int sr;
        char start = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (start == board[i][j]) {
                    sr = i;
                    sc = j;
                    if (helper(board, board.clone(), sr, sc, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = { { 'C', 'A', 'A' }, { 'A', 'A', 'A' }, { 'B', 'C', 'D' } };
        System.out.println(exist(board, "AAB"));
    }
}
