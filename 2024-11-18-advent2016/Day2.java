import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2{

  public static String getCode(String filename){
	try{
	  Scanner input = new Scanner(new File(filename));
	
	String line;
	String num = "";
    int x = 0, y = 0;
	String keyPos = " 201 311 500 610";//stores numXY separated by spaces (use indexOf with xy vals)
	String keyNeg = "2-11 4-10 7-1-1 80-1 91-1"; // 2 since 1-1 causes negative char
	char numChar;
	
	while(input.hasNextLine()){
	  line = input.nextLine();
	  for(int i = 0; i < line.length(); i++){
	    if(line.charAt(i) == 'U' && y < 1){ //for movement on keypad
		  y++;
		}else if(line.charAt(i) == 'D' && y > -1){
		  y--;
		}else if(line.charAt(i) == 'L' && x > -1){
		  x--;
		}else if(line.charAt(i) == 'R' && x < 1){
		  x++;
		}
	  }
	  System.out.println(""+x+y);
	  if(x < 0 || y < 0){
	    numChar = keyNeg.charAt(keyNeg.indexOf(""+x+y) - 1);
		System.out.println(numChar);
	  }else{
		numChar = keyPos.charAt(keyPos.indexOf(""+x+y) - 1);
		System.out.println(numChar);
	  }
	  if(numChar == '2' && x*y < 0){ //solves conflict with 1-11 and 91-1
		  numChar = '1';
	  }
	  if(numChar == '-'){
		numChar = '9';
	  }
	  System.out.println("xy: " + x + y + " num: " + numChar);
	  num += numChar;
    }
	return num;
	}catch(FileNotFoundException e){
	  System.out.println("File not found");
	  return null;
	}
  }
  
  
  public static void main(String[] args){
    System.out.println(getCode("Directions2.txt"));
  }
}
