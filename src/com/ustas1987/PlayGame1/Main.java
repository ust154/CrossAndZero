package com.ustas1987.PlayGame1;

import java.io.IOException;

public class Main {
    private static String nameOfPlayer;

    public static void main(String[] args) throws IOException {
        Field.helloPlayers(nameOfPlayer);
        Field.creatPlayers();
        Field.creatField();
        Field.showField2();
        Field.game();
    }
}



