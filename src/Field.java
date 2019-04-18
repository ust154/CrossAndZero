import java.io.IOException;

public class Field {
    public static final int SIZE = 2;

    //method to create the playing field
    public static void creatField()  {
        Character[][] field = new Character[SIZE][SIZE];
        for (int i = 0; i <= SIZE; i++) {
            for (int j = 0; i <= SIZE; j++) {
                field[i][j] = '.';
                System.out.println("The playing field is created!");
            }
        }
        //show the field
        for (Character[] i : field) {
            for (char j : i)
                System.out.print(j + " ");
        }
        System.out.println();
    }
}