import java.util.Scanner;

public class Game{
  public static void main(String[] args){
    Barbarian enemy = new Barbarian("barb", 80, 45);
    CodeWarrior player = new CodeWarrior("Joe", 120, "Rust");
      //while(true){
      System.out.println("Player " +player + ", " + player.getHP() + "/" + player.getmaxHP() +" HP," + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println("Enemy " + enemy + ", " + enemy.getHP() + "/" + enemy.getmaxHP() +" HP," + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      Scanner userIn = new Scanner(System.in);
  //}
}
}
