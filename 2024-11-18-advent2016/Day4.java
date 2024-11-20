import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Day4{

	public static int countLetterInString(String name, char letter){
	  int count = 0;
	  for(int i = 0; i < name.length(); i++){
	    if(name.charAt(i) == letter){
		  count++;
	    }
	  }
	  return count;
	}

	public static int sumRealRooms(String filename){
		try{
		  Scanner input = new Scanner(new File(filename));
		  String[] parts; //split with "-" delimiter then with "[" delimeter for sectorCheck
		  String line; //entire line
		  String name; // room name
		  String sectorCheck; // sectorID[checksum]
		  int sectorID;
		  String checkSum; //check sum letters for comparison
		  boolean real; //real or decoy room
		  int realSum = 0;
		  while(input.hasNextLine()){
			real = true;
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
			String[] checkArr = new String[checkSum.length()];
			for(int i = 0; i < checkArr.length; i++){
		      checkArr[i] = ""+checkSum.charAt(i);
			}
			String temp;
			int[] letterCounts = new int[checkSum.length()]; //holds in same indices num of appearances
			String ownSum = "";
			ArrayList<String> nameLetters = new ArrayList<String>(name.length()); // list of name letters
			for(int i =0; i < name.length(); i++){
				nameLetters.add(name.substring(i, i+1));
			}
			for(int i = 0; i < checkSum.length(); i++){
			  letterCounts[i] = countLetterInString(name, checkSum.charAt(i));
			}
			int max = letterCounts[0];
			for(int i = 1; i < letterCounts.length; i++){
			  if(letterCounts[i-1] == letterCounts[i]){
			    if(checkSum.substring(i-1, i).compareTo(checkSum.substring(i, i+1)) > 0){
				 real = false;
				 System.out.println(real);
				 /* temp = checkArr[i];
				  checkArr[i] = checkArr[i-1]
				  checkArr[i-1] = temp; */
				}else{

				}
			  }
			  if(letterCounts[i] > max){
			    real = false;
			  }else{
			    max = letterCounts[i];
			  }
			  System.out.println(max);
			}
			System.out.println(sectorID + " letter counts: " + real);
			if(real){
		      realSum += sectorID;
			}
			System.out.println(Arrays.toString(letterCounts));
		  }
		  return realSum;
		}catch(FileNotFoundException e){
		  System.out.println("File not found");
		  return -1;
		}
	}


	public static void main(String[] args){
	  System.out.println(sumRealRooms("Input4.txt"));
	}
}
