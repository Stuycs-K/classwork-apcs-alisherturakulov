import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ShortDistance{
  public static void main(String[] args){
    System.out.println(shortestDist("directionsA.txt"));
  }

  public static int shortestDist(String filename){
    File file = new File(filename);
    Scanner input = new Scanner(file);
    int blocks;
    
  }
}
