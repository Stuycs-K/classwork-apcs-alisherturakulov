//need import to use these objects
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester{
	public static void main(String[] args){
		System.out.println(countTrianglesA("inputA.txt") + ": should be 2");
		
	}
	
	
	//The file gives the side lengths of triangles one per line, count the number of valid triangles
	public static int countTrianglesA(String filename){
		//opening a file requires try/catch
		try{
			int count = 0;
			File file = new File(filename);
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				input.nextLine();
				if(isTriangle(input.nextInt(), input.nextInt(), input.nextInt())){
					count++;
				}
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
			File file = new File(fileName);
			Scanner input =  new Scanner(file);
			while(input.hasNextLine()) {
				input.nextLine();
				int a1 = input.nextInt(), b1 = input.nextInt(), c1 = input.nextInt();
				input.nextLine();
				int a2 = input.nextInt(), b2 = input.nextInt(), c2 = input.nextInt();
				input.nextLine();
				int a3 = input.nextInt(), b3 = input.nextInt(), c3 = input.nextInt();
				if(isTriangle(a1, a2, a3){
					count++;
				}else if(isTriangle(b1, b2, b3)){
					count++;
				}else if(isTriangle(c1, c2, c3)){
					count++;
				}
			}
			return count;
		}catch(){
			System.out.println("File not found");
			return 0;
		}
	}
}