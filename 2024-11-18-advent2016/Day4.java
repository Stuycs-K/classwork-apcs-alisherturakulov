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
			real = false;
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
		    //System.out.println("name: " + name + " sectID: " + sectorID + " checkSum: " + checkSum);
			String[] checkArr = new String[checkSum.length()];
			for(int i = 0; i < checkArr.length; i++){
		      checkArr[i] = ""+checkSum.charAt(i);
			}
			
			//int[] letterCounts = new int[checkSum.length()]; //holds in same indices num of appearances
			ArrayList<String> ownLetters = new ArrayList<String>(5); // every distinct letter appearing in nameLetters corresp indices to ownAmt
			ArrayList<Integer> ownAmt = new ArrayList<Integer>(5);   // amt each letter at corresponding indices in ownLetters appear in nameLetters
			ArrayList<String> nameLetters = new ArrayList<String>(name.length()); // list of name letters
			for(int i = 0; i < name.length(); i++){
				nameLetters.add(""+name.charAt(i)); //initialize list of letters in name
			}
			
			for(int i = 0; i < name.length(); i++){
				if(ownLetters.indexOf(nameLetters.get(i)) == -1){
					ownLetters.add(nameLetters.get(i)); //adds new letter to index i corresponding to ownAmt indices
					ownAmt.add(Integer.valueOf(countLetterInString(name, nameLetters.get(i).charAt(0)))); //adds letter count to corresponding indices 	
				}
			}
			int max;
			int maxIndex; // index of in ownLetters matching max
			int tem;
			String temp;
			for(int h = 0; h < ownLetters.size(); h++){ //orders the numbers of occurences greatest to least
				max = ownAmt.get(h);
				maxIndex = h;
				for(int i = maxIndex; i < ownLetters.size(); i++){ //orders greatest to least occurences
					if(ownAmt.get(i) > max){
						max = ownAmt.get(i);
						ownAmt.remove(i);
						ownAmt.add(maxIndex, max);
						temp = ownLetters.get(i);
						ownLetters.remove(i);
						ownLetters.add(maxIndex, temp);
					} if(ownAmt.get(i) == max){ //orders alphabetically a-z if occurences match
						if(ownLetters.get(maxIndex).compareTo(ownLetters.get(i)) > 0){
							temp = ownLetters.get(i);
							ownLetters.set(i, ownLetters.get(maxIndex));
							ownLetters.set(maxIndex, temp);
							//ownLetters.remove(i);
							//ownLetters.add(maxIndex, temp);
							System.out.println(ownLetters);
						}
					}
				}
			}
			temp = "";
			for(int i = 0; i < 5; i++){
				temp += ownLetters.get(i); //makes own checkSum of 5 most common ordered most to least
				System.out.println("checkSum: "+ checkSum + " " + ownLetters.get(i) + ";" + ownAmt.get(i).intValue() + " name: " + name + " ownLet: " + ownLetters.get(i));
				}
			real = checkSum.equals(temp);
			if(real){
				realSum += sectorID;
			}
			/*for(int i = 0; i < checkSum.length(); i++){
			  letterCounts[i] = countLetterInString(name, checkSum.charAt(i));
			}
			max = letterCounts[0];
			for(int i = 1; i < letterCounts.length; i++){
			  if(letterCounts[i-1] == letterCounts[i]){
			    if(checkSum.substring(i-1, i).compareTo(checkSum.substring(i, i+1)) > 0){
				 real = false;
				 System.out.println(real);
				 temp = checkArr[i];
				  checkArr[i] = checkArr[i-1]
				  checkArr[i-1] = temp; 
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
		return realSum; */
		} return realSum;
		}catch(FileNotFoundException e){
		  System.out.println("File not found");
		  return -1;
		}
	}


	public static void main(String[] args){
	  System.out.println(sumRealRooms("Input4.txt"));
	  //sumRealRooms("Input4.txt");
	}
}
