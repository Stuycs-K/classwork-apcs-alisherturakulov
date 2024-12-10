public class Barbarian extends Adventurer{
	private int special, specialMax;
	private String specialName = "Rage";

	//Constructor
	public Barbarian(String name, int hp, int special){
		super(name, hp);
		this.special = special;
		this.specialMax = special;
	}

	public Barbarian(String name, int hp){
		this(name, hp, 25);
	}

	public Barbarian(String name){
		this(name, 100);
	}


	//Methods
	public String getSpecialName(){
		return specialName;
	}
	//Accessors
	public int getSpecial(){
		return special;
	}

	public void setSpecial(int n){
		if(n > getSpecialMax()){
			n = getSpecialMax();
		}
		this.special = n;
	}

	public int getSpecialMax(){
		return specialMax;
	}

	/*
    all adventurers must have a way to attack enemies and
    support their allys
	*/
	//hurt or hinder the target adventurer
	public String attack(Adventurer other){
		other.applyDamage(5);
	    return this.getName() + " attacks and deals 5 damage against " + other.getName();
	}

	//heall or buff the target adventurer
	public String support(Adventurer other){
		return other.support() + " by " + this.getName();
	}

	//heall or buff self
	public String support(){
		int add = getHP() + 10;
		if(getmaxHP() < add){
			setHP(add);
			return this.getName() + " buffed 10 HP and restored " + restoreSpecial(10) + " " + getSpecialName();
		}
		setHP(add);
		return this.getName() + " healed 10 HP and restored " + restoreSpecial(10) + " " + getSpecialName();
	}

	//hurt or hinder the target adventurer, consume some special resource
	public String specialAttack(Adventurer other){
		if(this.getSpecial() - 15 > 0) {
		other.applyDamage(15);
		int result = this.getSpecial() - 15;
		if(result < 0){
			result = 0;
		}
		this.setSpecial(result);
		return this.getName() + " Used 15 " + this.getSpecialName() + " to damage " + other.getName() + " by 20";
		}else{
			return this.getName() + "doesn't have enough " + getSpecialName() + " " + this.attack(other);
		}
	}





}
