public class MyArrays{
  public static void main(String[] args){
	  System.out.println("Tests for aryToString-----------");
	  System.out.println(aryToString(new int[]{1, 2, 3, 4, 5}));
	  
	  System.out.println("Tests for returnCopy-----------");
	  System.out.println(aryToString(returnCopy(new int[]{1, 2, 3, 4, 5})) + "Should be: " + aryToString(new int[]{1, 2, 3, 4, 5}) );
	  System.out.println(aryToString(returnCopy(new int[]{1})) + "Should be: " + aryToString(new int[]{1}) );
	  System.out.println(aryToString(returnCopy(new int[]{1, 20, 300, 45, 5})) + "Should be: " + aryToString(new int[]{1, 20, 300, 45, 5}) );
	  System.out.println(aryToString(returnCopy(new int[]{100, 1000, 432, 543, 1, 54})) + "Should be: " + aryToString(new int[]{100, 1000, 432, 543, 1, 54}) );
	  System.out.println(aryToString(returnCopy(new int[]{})) + "Should be: " + aryToString(new int[]{}) );
	  
	  System.out.println("Tests for concatArray-----------"); 
	  /*
	  System.out.println(aryToString(concatArray(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5})));
	  System.out.println(aryToString(concatArray(new int[]{}, new int[]{})));
	  System.out.println(aryToString(concatArray(new int[]{1}, new int[]{54})));
	  System.out.println(aryToString(concatArray(new int[]{1, 201, 3, 44, 5}, new int[]{10, 2, 301, 42, 5}))); 
	  */
	  
  }
  /*
*Convert an array into a String that consists of the
*array's elements enclosed in square brackets "[]".
*Adjacent elements are separated by the characters ", "
* a String formatted like: "[4, 9, 11]"
*/
public static String aryToString(int[] nums){
  String start = "[";
  for (int i = 0; i < nums.length; i++) {
    if (i != (nums.length-1)) {
      start += nums[i] + ", ";
    } else if (i == (nums.length-1)) {
      start += nums[i];
    }
  }
  return start + "]";
}

// returns a new array with the same values as the parameter ary
public static int[] returnCopy(int[]ary) {
	int[] retAr = new int[ary.length];
	if (ary.length > 0) {
		for (int i = 0; i < ary.length; i++) {
			retAr[i] = ary[i];
		}
	}
	return retAr;
}

// returns a new array, that contains all of the values of ary1 followed by 
// all of the values of ary2. The order of the values should remain the same. 
/*
public static int[] concatArray(int[]ary1, int[]ary2) {
	return ;
}
*/


}
