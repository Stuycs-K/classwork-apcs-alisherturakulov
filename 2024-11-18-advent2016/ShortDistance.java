import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Day1 of 2016 Advent of Code TAXICAB geometry

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
	  char turn; //stores R or L
	  int blocks; // stores movement amt
	  int taxiCabDistance; //taxicab geometry https://en.wikipedia.org/wiki/Taxicab_geometry
	  
	  while(input.hasNext()){
	    String directions = input.next();
		turn = directions.charAt(0);
		blocks = Integer.parseInt(directions.substring(1,2));
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
		//System.out.println(x + ", " + y + " with dirIndex NESW: " + dirIndex + " blocks moved: " + blocks);
	  }
	  
	  taxiCabDistance = Math.abs(x) + Math.abs(y);
	  return taxiCabDistance;
	  
	}catch(FileNotFoundException e){
	  System.out.println("File not Found");
	  return -1;
	}
  }
}
