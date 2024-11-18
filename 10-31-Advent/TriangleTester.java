//need import to use these objects
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester{
	public static void main(String[] args){
		System.out.println(countTrianglesA("inputA.txt") + ": should be 2");
		System.out.println(countTrianglesA("inputTri.txt") + ": countA with inputTri, is probably right");

	  System.out.println("Tests for CountTrianglesB with inputA and inputTri------");
		System.out.println(countTrianglesB("inputA.txt") + ": should be 1");
		System.out.println(countTrianglesB("inputTri.txt") + ": is probably right, trust me pls");
		System.out.println(countTrianglesB("input.txt") + " should ret 0 and print FileNotFoundException");
		System.out.println(countTrianglesB("inputB.txt"));
	  System.out.println(countTrianglesA("inputB.txt"));
		}


	public static int countTrianglesA(String filename){
		try{
		File file = new File(filename);
		Scanner input = new Scanner(file);
		int count = 0;
		while(input.hasNextInt()){
			if(isTriangle(input.nextInt(), input.nextInt(), input.nextInt())) count++;
	  }
		return count;
	 }catch(FileNotFoundException e){
		 System.out.println("File not found");
		 return 0;
	 }
	}

	public static boolean isTriangle(int a, int b, int c){
		return a+b > c && a+c > b && b+c > a;
	}

	public static int countTrianglesB(String filename){
		try{
		int count = 0;
		File file = new File(filename);
		Scanner input = new Scanner(file);
		while(input.hasNextInt()){
			int a1 = input.nextInt(), b1 = input.nextInt(), c1 = input.nextInt();
			int a2 = input.nextInt(), b2 = input.nextInt(), c2 = input.nextInt();
			int a3 = input.nextInt(), b3 = input.nextInt(), c3 = input.nextInt();
			if(isTriangle(a1, a2, a3)) count++;
			if(isTriangle(b1, b2, b3)) count++;
			if(isTriangle(c1, c2, c3)) count++;
		}
		return count;
	  }catch(FileNotFoundException e){
			System.out.println("File not found");
			return 0;
		}
	}
}
