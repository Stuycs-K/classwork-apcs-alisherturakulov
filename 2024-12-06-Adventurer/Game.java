import java.util.Scanner;

public class Game{
  public static void main(String[] args){
	  Barbarian enemy = new Barbarian("Eren", 80, 45);
	  CodeWarrior player = new CodeWarrior("John Titor", 120, "Rust");
      Scanner userInput = new Scanner(System.in);
	  //while(player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println("Player " +player + ", " + player.getHP() + "/" + player.getmaxHP() +" HP," + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println("Enemy " + enemy + ", " + enemy.getHP() + "/" + enemy.getmaxHP() +" HP," + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
	  String input = userInput.nextLine();
	  if(input.toLowerCase().equals("a") || input.toLowerCase().equals("attack")){
		  System.out.println(player.attack(enemy));
	  }else if(input.toLowerCase().equals("sp") || input.toLowerCase().equals("special")){
		  System.out.println(player.specialAttack(enemy));
	  }else if(input.toLowerCase().equals("su") || input.toLowerCase().equals("support")){
		  System.out.println(player.support());
	  }else if(input.toLowerCase().equals("quit")){
		  System.exit(1);		  
	  }
  //}
}
}
