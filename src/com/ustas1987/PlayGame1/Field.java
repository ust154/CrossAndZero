package com.ustas1987.PlayGame1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Field {
    public static final String EMPTY_VALUE = "* ";
    public static final String PLAYER_SIGN = "X ";
    public static final String II_SIGN = "O ";
    public static int coordinateX;
    public static int coordinateY;
    public static int coordinateX2;
    public static int coordinateY2;
    public static final int SIZE = 3;
    public static boolean endTheGame;
    static String[][] field = new String[SIZE][SIZE];
    public static final String NAMEPC = "'Windows OS'";

    //method to create the playing field
    public static void creatField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY_VALUE;
            }
        }
    }

    //method to show the playing field
    public static void showField2() {
        for (String[] i : field) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void creatPlayers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOfPlayer = reader.readLine();
        System.out.println("Nice to meet you, " + nameOfPlayer + "!");
    }

    public static void helloPlayers(String nameOfPlayer) {
        System.out.println("Hello, player! My name is " + NAMEPC);
        System.out.println("Now we start to play the game. Tell me your name.");
    }

    /* player`s move in the game */
    public static void playerDoShoot() throws IOException {
        System.out.println("Make your move along the X axis, FROM 0 TO 2!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        coordinateX = Integer.parseInt(reader.readLine());
        System.out.println("OK!");
        System.out.println("Now, make your move along the Y axis, FROM 0 TO 2!");
        coordinateY = Integer.parseInt(reader.readLine());
        CheckTheGame.checkPlayerMove();
        field[coordinateX][coordinateY] = PLAYER_SIGN;
        System.out.println("Look at your game move:");

        showField2();// show the field
    }

    /* computer`s move in the game */
    public static void computerDoShoot() {
        System.out.println(NAMEPC + " maked his move:");
        coordinateX2 = (int) (Math.random() * 3);
        coordinateY2 = (int) (Math.random() * 3);

        while (field[coordinateX2][coordinateY2] == II_SIGN ||
                field[coordinateX2][coordinateY2] == PLAYER_SIGN) {
            coordinateX2 = (int) (Math.random() * 3);
            coordinateY2 = (int) (Math.random() * 3);
        }
        field[coordinateX2][coordinateY2] = II_SIGN;
        showField2(); // show the field
    }

    public static void game() throws IOException {
        do {
            playerDoShoot();
            CheckTheGame.checkPlayerLines(); // check the strings for wins
            if (CheckTheGame.lineChek) {
                System.out.println("GAME OVER!!! Player won");
                endTheGame = true;
                break;
            }
            computerDoShoot();
            CheckTheGame.checkComputerLines(); // check the strings for wins
            if (CheckTheGame.lineChek) {
                System.out.println("GAME OVER!!! 'Windows OS' won");
                endTheGame = true;
                break;
            }
        } while (!endTheGame);
    }
}




