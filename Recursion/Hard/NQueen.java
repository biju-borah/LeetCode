package Recursion.Hard;

import java.util.*;

public class NQueen {
    public static boolean isSafe(String[][] board, int r, int c) {
        for (int i = r - 1; i >= 0; i--) {// int i = 0; i < r; i++) {
            if (board[i][c] == "Q") {
                return false;
            }
        }
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == "Q") {
                return false;
            }
        }
        for (int i = r - 1, j = c + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == "Q") {
                return false;
            }
        }
        return true;
    }

    public static void helper(String[][] board, int n, int index, List<List<String>> res) {
        if (index == n) {
            ArrayList<String> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr.add(board[i][j]);
                }
            }
            res.add(arr);
            return;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (isSafe(board, index, i)) {
                board[index][i] = "Q";
                helper(board, n, index + 1, res);
                board[index][i] = ".";
                // return true;
            }
        }
        return;
    }

    public static String[][] solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        String[][] board = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ".";
            }
        }
        helper(board, n, 0, res);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.size());
        }
        return board;
    }

    public static void main(String[] args) {
        solveNQueens(4);
    }
}
