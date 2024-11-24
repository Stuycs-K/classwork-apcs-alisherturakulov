import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day6{
	public static void main(String[] args){
		System.out.println("ParseColumnsArr should be 8: " + parseColumnsArr("Input6.txt").length);
		System.out.println("Most common letter should be e: " + mostCommonLetter("ehegfe"));
		System.out.println(errorCorrectRepeated("Input6.txt"));
	}
	
	public static String[] parseColumnsArr(String filename){
		try{
		Scanner input = new Scanner(new File(filename));
		String[] lines = new String[624];
		for(int i = 0; input.hasNextLine(); i++){
			lines[i] = input.nextLine();
		}
		String[] columns = new String[8];
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
	
	public static String mostCommonLetter(String string){
		String letters = "";
		for(int i = 0; i < string.length(); i++){
			if(letters.indexOf(string.charAt(i)) == -1){
				letters += string.charAt(i);
			}
		}
		return letters;
	}
	
	public static String errorCorrectRepeated(String filename){
		String[] columns = parseColumnsArr(filename);
		for(int i = 0; i < columns.length; i++){
		break;
		}
		return null;
	}
}