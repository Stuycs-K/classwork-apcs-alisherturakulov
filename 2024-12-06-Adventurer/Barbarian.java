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
		this(name, hp, hp);
	}

	public Barbarian(String name){
		super(name);
		this.special = 10;
		this.specialMax = 10;
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
	    return "Dealt 5 damage against " + other.getName();
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
			return this.getName() + " buffed 10 HP";
		}
		setHP(add);
		return this.getName() + " healed 10 HP";
	}

	//hurt or hinder the target adventurer, consume some special resource
	public String specialAttack(Adventurer other){
		int result = other.getHP() - 20;
		other.setHP(result);

		result = this.getSpecial() - 15;
		if(result < 0){
			result = 0;
		}
		this.setSpecial(result);
		return this.getName() + " Used 15 " + this.getSpecialName() + " to hurt " + other.getName() + " by 20";
	}





}
