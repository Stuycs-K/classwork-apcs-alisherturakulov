//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //2 Opening a file requires a try/catch
    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      for (int i = 0; input.hasNextLine(); i++){
        if (i % 2 == 0){
          System.out.println(input.nextLine());
        }
        else{
          input.nextLine();
        }
      }
      input.close();

      Scanner input2 = new Scanner(file);
	  input = new Scanner(file);
      for (int i = 0; input.hasNextLine(); i++){
        if (input2.nextLine().indexOf("{") != -1){
          System.out.println(input.nextLine());
        }
        else{
          input.nextLine();
        }
      }
      input2.close();//releases the file from your program
	  input.close();

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    } 
  }
}
