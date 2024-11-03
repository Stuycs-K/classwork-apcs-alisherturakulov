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
			for(int i = 0; input.hasNextLine(); i++){
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
		return 0;
	}
}