package com.workshop;

import java.util.Arrays;

public class ChooseLetter {
    private static final char EMPTY = ' ';
    private static final char CROSS = 'X';
    private static final char ROUND = 'O';
    private char[] board;
    private char playerSymbol;
    private char computerSymbol;


    ChooseLetter() {
        board = new char[10];
        Arrays.fill(board,EMPTY);
    }

    private ChooseLetter(char[] board, char playerSymbol, char computerSymbol) {
        this.board = board;
        this.playerSymbol = playerSymbol;
        this.computerSymbol = computerSymbol;

    }

    public char getPlayerSymbol() {
        return playerSymbol;
    }

    public char getComputerSymbol() {
        return computerSymbol;
    }
    /*
     * Choosing player symbol either 'X' or 'O'
     *
     * @param playerSymbol
     * */

    public void choosePlayerSymbol(char playerSymbol) {
        if (playerSymbol == CROSS) {
            this.playerSymbol = CROSS;
            this.computerSymbol = ROUND;
        } else if (playerSymbol == ROUND) {
            this.playerSymbol = ROUND;
            this.computerSymbol = CROSS;
        } else
            System.out.println("Invalid Symbol");
    }


    public static void main(String[] args) {
        ChooseLetter game = new ChooseLetter();
        System.out.println("Player symbol is: " + game.getPlayerSymbol());
        System.out.println("initial:");
    }
}

