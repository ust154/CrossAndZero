import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Players {
    public static final String NAMEPC = "'Windows OS'";

    public static void helloPlayers(String nameOfPlayer) {
        System.out.println("Hello, player! My name is " + NAMEPC);
        System.out.println("Now we start to play the game. Tell me your name.");

    }

    public static void creatPlayers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOfPlayer = reader.readLine();
        System.out.println("Nice to meet you, " + nameOfPlayer + "!");
        Players humanPlayer = new Players();
        Players computerPlayer = new Players();
    }

    //player`s move in the game
    public static void moveByPlayer() throws IOException {
        System.out.println("Make your move along the X axis!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int coordinateX = Integer.parseInt(reader.readLine());
        System.out.println("OK!");
        System.out.println("Now, make your move along the Y axis!");
        int coordinateY = Integer.parseInt(reader.readLine());
    }
}
