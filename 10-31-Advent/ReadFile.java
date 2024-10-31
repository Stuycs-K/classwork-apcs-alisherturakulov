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
      for (int i = 0; input2.hasNextLine(); i++){
        if (input2.next().indexOf("{") != -1){
          System.out.println(input2);
        }
        else{
          input2.nextLine();
          //f
        }
      }
      input2.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }
}
