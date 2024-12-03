public class ColorDemo{
    public static void main(String[] args){
      go(1,1);
      color(31, 34);
	  for(int i = 0; i < 10; i++){
		  System.out.println("---->" + i);
	  }
	  go(24, 80);
	  System.out.println("Hello");
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
      System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
    }

    public static void color(int foreground, int background, int modifier){
      System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
    }

}
