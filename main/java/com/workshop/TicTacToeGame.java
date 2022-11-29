package com.workshop;

public class TicTacToeGame {
    static char[] board =new char[10];
    public static void main(String[] args) {
        createEmptyBoard();
    }
    private static void createEmptyBoard() {
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
    }

}
