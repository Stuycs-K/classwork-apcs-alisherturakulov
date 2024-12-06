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
	
	public int getSpecial(){
		return special;
	}
	
	public void setSpecial(int n){
		if(n > getSpecialMax() - getSpecial()){
			n = getSpecialMax();
		}
		this.special = n;
	}
	
	public int getSpecialMax(){
		return specialMax;
	}
	
	
	
}