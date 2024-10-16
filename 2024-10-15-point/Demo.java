public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    double xDist = Math.pow(b.getX() - a.getX(), 2);
    double yDist = Math.pow(b.getY() - a.getY(), 2);
    return Math.pow( xDist + yDist, .5);
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p1);
	//print using the toString() method we defined in Point.java
    System.out.println(p3);
	System.out.println(p4); //should be same as p1
	//corresponding tests for each dist mathod should be equal
    System.out.println( distance(p1,p2)); 
	System.out.println( distance(p1, p3));
	System.out.println( distance(p2, p3));
    System.out.println( Point.distance(p1,p2));
	System.out.println( Point.distance(p1, p3));
	System.out.println( Point.distance(p2, p3));
    System.out.println( p1.distanceTo(p2));
	System.out.println( p1.distanceTo(p3));
	System.out.println( p2.distanceTo(p3));
  }
}
