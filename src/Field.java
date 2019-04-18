import java.io.IOException;

public class Field {
    public static final int SIZE = 3;

    //method to create the playing field
    public static void creatField() {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = '.';
            }
        }
        System.out.println("The playing field is created! Look this field:");
        //show the field
        for (char[] i : field) {
            for (char j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}