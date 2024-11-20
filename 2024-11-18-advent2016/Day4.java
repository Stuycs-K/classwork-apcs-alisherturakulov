import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Day4{	
	
	public static int sumRealRooms(String filename){
		try{
		  Scanner input = new Scanner(new File(filename));
		  String[] parts; //split with "-" delimiter then with "[" delimeter for sectorCheck
		  String line; //entire line
		  String name; // room name
		  String sectorCheck; // sectorID[checksum]
		  int sectorID; 
		  String checkSum; //check sum letters for comparison
		  while(input.hasNextLine()){
		    name = "";
			sectorCheck = "";
			line = input.nextLine();
			parts = line.split("-");
		    for(int i = 0; i < parts.length-1; i++){
		      name += parts[i]; 
			}
			sectorCheck = parts[parts.length-1];
			sectorID = Integer.parseInt(sectorCheck.substring(0, sectorCheck.indexOf("[")));
			checkSum = sectorCheck.substring(sectorCheck.indexOf("[")+1, sectorCheck.length()-1);
		    System.out.println("name: " + name + " sectID: " + sectorID + " checkSum: " + checkSum);
		  }
		  return -1;
		}catch(FileNotFoundException e){
		  System.out.println("File not found");
		  return -1;
		}
	}
	
	
	public static void main(String[] args){
	  sumRealRooms("Input4.txt");
	}
}