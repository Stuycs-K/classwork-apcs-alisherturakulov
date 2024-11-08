/*  Overriding the getName method in the Bird subclass, 
    the speak method called the redefined getName from the Bird class.
 
    Only assigning an Animal type to a Bird type did not work. This is because although 
	Bird is-a Animal and Bird can use the same methods as Animal, Animal cant be assigned 
	to the Bird type since the Bird would end up with undefined fields that the Animal class doesnt have.*/

public class Driver{
    public static void main(String[] args){
      System.out.println("INITIAL TESTS\n");
      Animal sheep = new Animal("Baa", 4, "Shaun");
      sheep.speak();
      System.out.println("--------");
      Bird bluejay = new Bird("chirp", 3, "bob", 2.4, "blue");
      bluejay.speak();
	  System.out.println("\nType Assignment Tests");
	  Animal a1 = new Animal("ahhk", 3, "Trixy");
	  Animal a2 = new Bird("squee", 4, "sheldon", 4.5, "mahogany");
	  Bird b1 = new Bird("quack", 5, "donald", 48.5, "green");
	  // Bird b2 = new Animal("nya", 1, "Simba"); incompatible types error
	  a1.speak();
	  System.out.println("--------");
	  a2.speak();
	  System.out.println("--------");
	  b1.speak();
    }
}
