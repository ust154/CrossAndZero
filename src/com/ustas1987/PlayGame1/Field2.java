package com.ustas1987.PlayGame1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Field2 {
    public static final int SIZE = 3;
    static String[][] field = new String[SIZE][SIZE];
    public static final String NAMEPC = "'Windows OS'";

    //method to create the playing field
    public static void creatField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = "* ";
            }
        }
    }
//    public static void creatField2() {
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                field[i][j] = "*";
//            }
//        }
//  }
    public static void showField2() {
        System.out.println("The playing field is created! Look this field:");
        //show the field
        for (String[] i : field) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void helloPlayers(String nameOfPlayer) {
        System.out.println("Hello, player! My name is " + NAMEPC);
        System.out.println("Now we start to play the game. Tell me your name.");
    }

    public static void creatPlayers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOfPlayer = reader.readLine();
        System.out.println("Nice to meet you, " + nameOfPlayer + "!");
    }

    /* player`s move in the game */
    public static void playerDoShoot() throws IOException {
        System.out.println("Make your move along the X axis, FROM 0 TO 2!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int coordinateX = Integer.parseInt(reader.readLine());
        System.out.println("OK!");
        System.out.println("Now, make your move along the Y axis, FROM 0 TO 2!");
        int coordinateY = Integer.parseInt(reader.readLine());
        field[coordinateX][coordinateY] = "X ";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println(" ");
        }
    }
}
