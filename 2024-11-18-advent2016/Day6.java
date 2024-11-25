import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day6{
	public static void main(String[] args){
		System.out.println("ParseColumnsArr size should be 8: " + parseColumnsArr("Input6.txt").length);
		System.out.println("Most common letter should be e: " + mostCommonLetter("ehegfe"));
		System.out.println(errorCorrectRepeated("Input6.txt")); // edited for PART 2 Least common letters
	}
	
	public static String[] parseColumnsArr(String filename){ //returns string[] of columns
		try{
		Scanner input = new Scanner(new File(filename));
		String[] lines = new String[624];
		for(int i = 0; input.hasNextLine(); i++){
			lines[i] = input.nextLine();
		}
		String[] columns = new String[8];
		for(int i = 0; i < columns.length; i++){
			columns[i] = ""; //to get rid of null default
		}
		for(int i = 0; i < columns.length; i++){
			for(int j = 0; j < lines.length; j++){
					columns[i] += lines[j].charAt(i);
			}
		}
		return columns;
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return null;
		}
	}
	
	public static char mostCommonLetter(String string){
		String letters = ""; //will hold each distinct letter from string
		for(int i = 0; i < string.length(); i++){ //initialize letters
			if(letters.indexOf(string.charAt(i)) == -1){
				letters += string.charAt(i);
			}
		}
		int[] amounts = new int[letters.length()]; //corresponding indices with number of each etters in string
		for(int i = 0; i < letters.length(); i++){ //initialize int[] amounts
			for(int j = string.indexOf(letters.charAt(i)); j < string.length(); j++){
				if(string.charAt(j) == letters.charAt(i)){
					amounts[i]++;
				}
			}
		}
		/*commented out part 1
		int maxNum = 0;
		int maxIndex = -1;
		for(int i = 0; i < amounts.length; i++){ //
			if(amounts[i] > maxNum){
				maxNum = amounts[i];
				maxIndex = i;
			}
		}*/
		int minNum = 624;
		int minIndex = -1;
		for(int i = 0; i < amounts.length; i++){
			if(amounts[i] < minNum){
			minNum = amounts[i];
			minIndex = i;
			}
		}
		
		
		return letters.charAt(minIndex/*maxIndex*/); 
	}
	
	public static String errorCorrectRepeated(String filename){ //gets message from repeated signal message
		String[] columns = parseColumnsArr(filename);
		String message = "";
		for(int i = 0; i < columns.length; i++){
			message += mostCommonLetter(columns[i]);
		}
		return message;
	}
}