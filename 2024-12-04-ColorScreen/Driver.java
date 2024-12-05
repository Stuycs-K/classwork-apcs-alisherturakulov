public class Driver{
	//Modifiers
	public static final int BRIGHT = 1;
	public static final int DARK = 2;
	public static final int ITALICS = 3;
	//Colors
	public static final int BLACK = 30;
	public static final int RED = 31;
	public static final int GREEN = 32;
	public static final int YELLOW = 33;
	public static final int BLUE = 34;
	public static final int MAGENTA = 35;
	public static final int CYAN = 36;
	public static final int WHITE = 37;
	//public static final int[] colors = new int[]{0};
	//Controls
	public static final String CLEAR_SCREEN = "\033[2J";
	public static final String SHOW_CURSOR = "\033[?25h";
	public static final String HIDE_CURSOR = "\033[?25l";
	
	public static final String RESET = "\033[0m"+SHOW_CURSOR;
	
	
	public static int background(int color){
		return 10+color;
	}
	
	public static void go(int r, int c){
		System.out.print("\033["+ r + ";" + c + "H");
	}
	
	public static void color(int m){
		System.out.print("\033[;" + m + "m");
	}
	public static void color(int m1, int m2){
		System.out.print("\033["+ m1 + ";" + m2 + "m");
	}
	public static void color(int m1, int m2, int m3){
		System.out.print("\033["+ m1 + ";" + m2 + ";" + m3 + "m");
	}
	public static void color(int m1, int m2, int m3, int m4){
		System.out.print("\033["+ m1 + ";" + m2 + ";" + m3 + ";"+m4+"m");
	}

	
	public static void wait(int millis){
		try{
			Thread.sleep(millis);
		}catch(InterruptedException e){
			
		}
	}
	
	
	public static void erase(int r, int c, int size){
		go(r, c);
		System.out.print("\033[0m");
		for(int i = 0; i < size; i++){
			System.out.print(" ");
		}
	}
	
	
	public static void main(String[] args){
		System.out.print(CLEAR_SCREEN);
		System.out.print(HIDE_CURSOR);
		color(background(BLUE), WHITE);
		
		//Set up Border 80x30 with color
		go(1,1);
		for(int i = 0; i < 80; i++){
			System.out.print("=");
		}
		for(int i = 1; i <= 30; i++){
			go(i, 1);
			System.out.print("H");
		}
		for(int i = 2; i<= 30; i++){
			go(i,80);
			System.out.print("H");
		}
		go(30,1);
		color(background(WHITE), GREEN);
		for(int i = 0; i < 80; i++){
			System.out.print("M");
		}
		
		int[] randoms = new int[]{((int) Math.Random()*100),((int) Math.Random()*100), ((int) Math.Random()*100)};
		
		go(2,20);
		for(int i = 1; i <= 3; i++){
			go(2, 1+(19*i));
			if(randoms[i-1] < 25){
				
			}else if(randoms[i-1] > 95){
				
			}else{
				
			}
			System.out.print();
		}
		System.out.print(randoms[0]);
		
		
		System.out.print(RESET);
	}
}