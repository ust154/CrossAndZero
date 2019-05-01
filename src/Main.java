import com.ustas1987.PlayGame1.Field2;

import java.io.IOException;

public class Main {
    private static String nameOfPlayer;

    public static void main(String[] args) throws IOException {
        Field2.helloPlayers(nameOfPlayer);
        Field2.creatPlayers();
        Field2.creatField();
        Field2.showField2();
        Field2.game();
    }
}



