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
    }
}
