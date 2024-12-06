public class Driver{
	
	public static void main(String[] args){
		Adventurer a1 = new Barbarian("Bob", 100, 200);
		Adventurer a2 = new Barbarian("Joe", 50, 400);
		a1.setName("Bane");
		a1.setHP(10);
		a1.setSpecial(60);
		a1.applyDamage(10);
		a1.support();
		a1.support(a2);
		a1.specialAttack(a2);
		System.out.println(a1 + " HP" + a1.getHP() + " maxHP" + a1.getmaxHP());
		System.out.println(a1 + " special" + a1.getSpecial() + " specialMax" + a1.getSpecialMax());
		System.out.println(a2 + " HP" + a2.getHP() + " specialMax" + a2.getSpecialMax());
	}
}