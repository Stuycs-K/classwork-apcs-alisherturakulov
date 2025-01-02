public class Fib{
  public static void main(String[] args){
  /* System.out.println(fib(0));
   System.out.println(fib(1));
   System.out.println(fib(2));
   System.out.println(fib(3));*/
   System.out.println(fib(46)); //largest that takes lless than 100 seconds
   // about 2.1 billion max possible
  }

  public static int fib(int n){
    if(n == 1 || n == 0){
      return n;
    }else{
      return fib(n-2) + fib(n-1);
    }
  }
}
