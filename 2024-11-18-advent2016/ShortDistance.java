import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortDistance{
  public static void main(String[] args){
    System.out.println(shortestDist("directionsA.txt"));
  }

  public static int shortestDist(String filename){
	try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int x = 0, y = 0; // initial coordiinate points
	  char[] dirs = new char[]{'N', 'E', 'S', 'W'}; //compass directions for determining add/subtraction x/y
	  int dirIndex = 0;
	  
	  while(input.hasNext()){
	    String directions = input.next();
		char turn = directions.charAt(0);
		int blocks = Integer.parseInt(directions.substring(1,2));
		//to change facing direction
		if(dirs[dirIndex] == 'N' &&  turn == 'L'){
	      dirIndex = 3;
		}else if(dirs[dirIndex] == 'W' && turn == 'R'){
	      dirIndex = 0;
		}else if(turn == 'L'){
		  dirIndex--;
		}else if(turn == 'R'){
		  dirIndex++;
		}
		//to change x/y value based on facing direction
		if(dirIndex == 0){
	      y += blocks;
		}else if(dirIndex == 1){
		  x += blocks;
		}else if(dirIndex == 2){
		  y -= blocks;
		}else if(dirIndex == 3){
		  x -= blocks;
		}
	  }
	  
	}catch(FileNotFoundException e){
	  System.out.println("File not Found");
	}
    
  }
}
