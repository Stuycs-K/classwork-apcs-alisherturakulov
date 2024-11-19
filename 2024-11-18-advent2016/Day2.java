import java.util.*;
import java.io.*;

public class Day2{

  public static String parse(String filename){
    try{
      Scanner input = new Scanner(new File(filename));
      String line;
      if(input.hasNextLine()){
        line = input.nextLine();
      }
      return line;
    }catch(FileNotFoundException e){
      System.exit(1);
      return null;
    }
  }

  public static int getCode(String filename){
    int x = 0, y = 0;
    

  }
  public static void main(String[] args){

  }
}
