public class Driver{
	
	public static void main(String[] args){
		Adventurer a1 = new Barbarian("Bob", 100, 200);
		a1.setName("Bane");
		a1.setHP(10);
		a1.setSpecial(60);
		System.out.println(a1 + " HP" + a1.getHP() + " maxHP" + a1.getmaxHP());
		System.out.println(a1 + " special" + a1.getSpecial() + " specialMax" + a1.getSpecialMax());
	}
}