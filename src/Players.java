public class Players{
  String name;
  public Players (String name){
  this.name = name;
  }
  
  Players humanPlayer = new Players();
  Players computerPlayer = new Players();
  
  BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
  String nameOfPlayer = read.readLine();
  
  //player`s move in the game
  void moveByPlayer(){
  System.out.println("Make your move along the X axis!")
  BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
  int coordinateX = Integer.parseInt(reader.readLine());
    
  System.out.println("Make your move along the Y axis!")
  BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
  int coordinateY = Integer.parseInt(reader.readLine());
    
  }
}
