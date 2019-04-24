import java.io.IOException;

public class Field {
    public static final int SIZE = 3;
    static String[][] field = new String[SIZE][SIZE];

    //method to create the playing field
    public static void creatField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = "*";
            }
        }
        showField(field);
    }

    public static void showField(String[][] field) {
        System.out.println("The playing field is created! Look this field:");
        //show the field
        for (String[] i : field) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}