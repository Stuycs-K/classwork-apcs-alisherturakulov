import java.util.Scanner;

public class Game{
	public static void main(String[] args){
		Barbarian enemy = new Barbarian("Eren Jaeger", 80, 45);
	    CodeWarrior player = new CodeWarrior("John Titor", 120, "APL");
		Scanner userInput = new Scanner(System.in);
		boolean correctIn = true;
		int enemyAct;
		while(player.getHP() > 0 && enemy.getHP() > 0){
			System.out.println("Player " +player + ", " + player.getHP() + "/" + player.getmaxHP() +" HP," + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
			System.out.println("Enemy " + enemy + ", " + enemy.getHP() + "/" + enemy.getmaxHP() +" HP," + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
			System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
			String input = userInput.nextLine();
			if(input.toLowerCase().equals("a") || input.toLowerCase().equals("attack")){
				correctIn = true;
				System.out.println(player.attack(enemy));
			}else if(input.toLowerCase().equals("sp") || input.toLowerCase().equals("special")){
				correctIn = true;
				System.out.println(player.specialAttack(enemy));
			}else if(input.toLowerCase().equals("su") || input.toLowerCase().equals("support")){
				correctIn = true;
				System.out.println(player.support());
			}else if(input.toLowerCase().equals("quit")){
				System.exit(1);		  
			}else{
				System.out.println("Incorrect input: enter correct argument");
				correctIn = false;
			}
			if(correctIn && enemy.getHP() > 0){
				enemyAct = (int) Math.random()*3;
				if(enemyAct == 0){
					System.out.println(enemy.attack(player));
				}else if(enemyAct == 1){
					System.out.println(enemy.support());
				}else{
					System.out.println(enemy.specialAttack(player));
				}
			  
			}
	}
	System.out.println("Results:\n" + player + " " + player.getHP() + "/" + player.getmaxHP());
	System.out.println(enemy + " " + enemy.getHP() + "/" + enemy.getmaxHP());
	
  }
}
