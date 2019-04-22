import java.io.IOException;

public class Main {
    private static String nameOfPlayer;

    public static void main(String[] args) throws IOException {
        Players humanPlayer = new Players();
        Players computerPlayer = new Players();

        Players.helloPlayers(nameOfPlayer);
        Players.creatPlayers();
        Field.creatField();
        Players.moveByPlayer();
    }
}



