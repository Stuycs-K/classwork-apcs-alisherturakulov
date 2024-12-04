public class ColorDemo{
    public static void main(String[] args){
	  go(1,1);
	  System.out.println("\u001b[2J");
      color(31, 34);
	  int foreground;
	  int background;
	  int modifier;
	  for(int i = 1; i < 25; i++){
		 
		  for(int j = 0; j < i; j++){
			System.out.print("\u001b[" + i + ";" + j + "f");
			foreground = ((int) (Math.random()*9)) + 30;
		    background = ((int) (Math.random()*9)) + 40;
		    modifier = 4;
			sleep(10);
			System.out.print("\u001b[" + foreground + ";" + background + ";" + modifier + "m");
		    System.out.print(" for:"+ foreground + " back:" + background + " mod:" + modifier);
		  }
		  System.out.println("\u001b[0m\u001b[0J\u001b[6m" + "Executing..." + (i*100)/25 + "%");
	  }
	  go(24, 75);
	  System.out.println("Done");
      System.out.print("\u001b[0m");
    }

    public static void sleep(int milli){
        try{
          Thread.sleep(milli);
        }catch(Exception e){
        }
    }

    public static void go(int r, int c){
      System.out.print("\u001b[" + r + ";" + c + "f");
    }

    public static void color(int foreground,int background){
      System.out.print( "\u001b[" + foreground + ";" + (background) + "m");
    }

    public static void color(int foreground, int background, int modifier){
      System.out.print( "\u001b[" + foreground + ";" + (background) + ";" + modifier + "m");
    }

}
