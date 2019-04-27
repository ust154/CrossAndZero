package com.ustas1987.PlayGame1;

import java.io.IOException;

import static com.ustas1987.PlayGame1.Field2.*;

public class CheckTheGame {

    // checking the move by player
    public static void checkPlayerMove() throws IOException {
        while (field[coordinateX][coordinateY] == PLAYER_SIGN ||
                field[coordinateX][coordinateY] == II_SIGN) {
            System.out.println("This is wrong move!!! Try again!");
            playerDoShoot();
        }
    }
}
