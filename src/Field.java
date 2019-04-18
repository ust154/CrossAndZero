public class Field{
  public final int SIZE = 3;
  //method to create the playing field
  void creatField(){ 
  char[][] field = new char[SIZE][SIZE];
  for (int i = 0; i < SIZE; i++){
    for (int j = 0; i < SIZE; j++){
    field[i][j] = '.';
      System.out.println("The playing field is created! Go to start, Player 1!");
  }
}
    //method to show the field
    void showField(){
    for ([] i : field){
      for (j : i)
    System.out.print(j);
    }
      System.out.println();
    }
