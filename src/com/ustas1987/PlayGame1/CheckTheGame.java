package com.ustas1987.PlayGame1;

import java.io.IOException;

import static com.ustas1987.PlayGame1.Field2.*;

public class CheckTheGame {
//    static String a1 = field[0][0];
//    static String b1 = field[0][1];
//    static String c1 = field[0][2];
//    static String a2 = field[1][0];
//    static String b2 = field[1][1];
//    static String c2 = field[1][2];
//    static String a3 = field[2][0];
//    static String b3 = field[2][1];
//    static String c3 = field[2][2];

    // checking the move by player
    public static void checkPlayerMove() throws IOException {
        while (field[coordinateX][coordinateY] == PLAYER_SIGN ||
                field[coordinateX][coordinateY] == II_SIGN) {
            System.out.println("This is wrong move!!! Try again!");
            playerDoShoot();
        }
    }

    //checking the strings
    public static void checkString() {
        String a1 = field[0][0];
        String b1 = field[0][1];
        String c1 = field[0][2];
        String a2 = field[1][0];
        String b2 = field[1][1];
        String c2 = field[1][2];
        String a3 = field[2][0];
        String b3 = field[2][1];
        String c3 = field[2][2];

        if (a1 == PLAYER_SIGN && b1 == PLAYER_SIGN && c1 == PLAYER_SIGN) {
            System.out.println("Player wins!!!");
        } else if (a2 == PLAYER_SIGN && b2 == PLAYER_SIGN && c2 == PLAYER_SIGN) {
            System.out.println("Player wins!!!");
        } else if (a3 == PLAYER_SIGN && b3 == PLAYER_SIGN && c3 == PLAYER_SIGN) {
            System.out.println("Player wins!!!");
        } else if (a1 == PLAYER_SIGN && a2 == PLAYER_SIGN && a3 == PLAYER_SIGN) {
            System.out.println("Player wins!!!");
        } else if (b1 == PLAYER_SIGN && b2 == PLAYER_SIGN && b3 == PLAYER_SIGN) {
            System.out.println("Player wins!!!");
        } else if (c1 == PLAYER_SIGN && c2 == PLAYER_SIGN && c3 == PLAYER_SIGN) {
            System.out.println("Player wins!!!");
        } else if (a1 == PLAYER_SIGN && b2 == PLAYER_SIGN && c3 == PLAYER_SIGN) {
            System.out.println("Player wins!!!");
        } else if (a3 == PLAYER_SIGN && b2 == PLAYER_SIGN && c1 == PLAYER_SIGN) {
            System.out.println("Player wins!!!");
        }
        else if (a1 == II_SIGN && b1 == II_SIGN && c1 == II_SIGN) {
            System.out.println("Computer wins!!!");
        }else if (a2 == II_SIGN && b2 == II_SIGN && c2 == II_SIGN) {
            System.out.println("Computer wins!!!");
        }else if (a3 == II_SIGN && b3 == II_SIGN && c3 == II_SIGN) {
            System.out.println("Computer wins!!!");
        }else if (a1 == II_SIGN && a2 == II_SIGN && a3 == II_SIGN) {
            System.out.println("Computer wins!!!");
        }else if (b1 == II_SIGN && b2 == II_SIGN && b3 == II_SIGN) {
            System.out.println("Computer wins!!!");
        }else if (c1 == II_SIGN && c2 == II_SIGN && c3 == II_SIGN) {
            System.out.println("Computer wins!!!");
        }else if (a1 == II_SIGN && b2 == II_SIGN && c3 == II_SIGN) {
            System.out.println("Computer wins!!!");
        }else if (a3 == II_SIGN && b2 == II_SIGN && c1 == II_SIGN) {
            System.out.println("Computer wins!!!");
        }
    }

//    public static void checkStringII() {
//        if (a1 == II_SIGN && b1 == II_SIGN && c1 == II_SIGN) {
//            System.out.println("Computer wins!!!");
//        } if (a2 == II_SIGN && b2 == II_SIGN && c2 == II_SIGN) {
//            System.out.println("Computer wins!!!");
//        } if (a3 == II_SIGN && b3 == II_SIGN && c3 == II_SIGN) {
//            System.out.println("Computer wins!!!");
//        } if (a1 == II_SIGN && a2 == II_SIGN && a3 == II_SIGN) {
//            System.out.println("Computer wins!!!");
//        } if (b1 == II_SIGN && b2 == II_SIGN && b3 == II_SIGN) {
//            System.out.println("Computer wins!!!");
//        } if (c1 == II_SIGN && c2 == II_SIGN && c3 == II_SIGN) {
//            System.out.println("Computer wins!!!");
//        } if (a1 == II_SIGN && b2 == II_SIGN && c3 == II_SIGN) {
//            System.out.println("Computer wins!!!");
//        } if (a3 == II_SIGN && b2 == II_SIGN && c1 == II_SIGN) {
//            System.out.println("Computer wins!!!");
//        }
//
//    }
}

