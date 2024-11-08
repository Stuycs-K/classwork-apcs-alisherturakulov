/*  Overriding the getName method in the Bird subclass, the speak method called the redefined
 getName from the Bird class.
*/

public class Driver{
    public static void main(String[] args){
      System.out.println("INITIAL TESTS\n");
      Animal sheep = new Animal("Baa", 4, "Shaun");
      sheep.speak();
      System.out.println("--------");
      Bird bluejay = new Bird("chirp", 3, "bob", 2.4, "blue");
      bluejay.speak();
    }
}
