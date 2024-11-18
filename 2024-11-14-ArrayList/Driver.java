import java.util.ArrayList;

public class Driver{
	public static void main(String[] args){
	  ArrayList<String> randoms = ArrayListPractice.createRandomArray(10);
	  System.out.println(randoms);
	  ArrayList<String> rand2 = ArrayListPractice.createRandomArray(50);
	  System.out.println(rand2);

	  ArrayListPractice.replaceEmpty(randoms);
      System.out.println(randoms);
	  ArrayListPractice.replaceEmpty(rand2);
	  System.out.println(rand2);

      ArrayList<String> reversed = ArrayListPractice.makeReverseList(randoms);
      System.out.println(reversed);
	  ArrayList<String> reversed2 = ArrayListPractice.makeReverseList(rand2);
	  System.out.println(reversed2);
	 
	  
	  ArrayList<String> al1 = ArrayListPractice.createRandomArray(23);
	  ArrayList<String> al2 = ArrayListPractice.createRandomArray(62);
	  ArrayList<String> al3 = ArrayListPractice.createRandomArray(40);
	  
	  System.out.println(ArrayListPractice.mixLists(randoms, rand2));
	  ArrayList<String> mixed = ArrayListPractice.mixLists(al1, al2);
	  System.out.println(mixed);
	  ArrayList<String> mixed2 = ArrayListPractice.mixLists(al2, al3);
	  System.out.println(mixed2);
	  ArrayList<String> mixed3 = ArrayListPractice.mixLists(al2, rand2);
	  System.out.println(mixed3);
	  
	  System.out.println("\nlarge data tests-----------------------------------");
	  ArrayList<String> rand3 = ArrayListPractice.createRandomArray(200000);
	  ArrayList<String> rand4 = ArrayListPractice.createRandomArray(240000);
	  System.out.println("finish createRandom big data");
	  ArrayListPractice.replaceEmpty(rand4);
	  ArrayListPractice.replaceEmpty(rand3);
	  System.out.println("finish replaceEmpty big data");
	  rand4 = ArrayListPractice.makeReverseList(rand4);
	  rand3 = ArrayListPractice.makeReverseList(rand3);
	  System.out.println("finish reverse big data");
	  ArrayList<String> mixed4 = ArrayListPractice.mixLists(rand3, rand4);
	  System.out.println(mixed4);
	  
	
	
	}
}
