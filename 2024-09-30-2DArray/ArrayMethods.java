public class ArrayMethods{
  public static void main(String[] args){
    // Alishair; aturakulov50@stuy.edu
    // Estella; eyee60@stuy.edu.

    // Test arrToString with 2D parameter
	System.out.println("Tests for ArrToString---------------------");
    System.out.println(arrToString(new int[][] {{1, 2}, {5, 6}, {0, 3, 5}}));
    System.out.println(arrToString(new int[3][4]));
	System.out.println(arrToString(new int[0][]));
	System.out.println(arrToString(new int[4][0]));
	System.out.println(arrToString(new int[3][3]));
	System.out.println(arrToString(new int[][]{{1, 2, 3, 4}, {2, 65, 5}, {3, 6, 9, 12}, {4, 8, 432, 0, 6, 3, 6, 2}}));
	System.out.println("Tests for ArrToString---------------------");
	System.out.println(arr2DSum(new int[1][1])); // should be zero
	System.out.println(arr2DSum(new int[][]{{1, 2, 3}, {1}, {2, 6, 2, 3, 5, 7}, {100}})); // should be 132
	System.out.println(arr2DSum(new int[][]{{100, 200, 320}, {0}, {430, 10, 10, 10}, {435}})); //  1515
	System.out.println(arr2DSum(new int[][]{{1, 0, 0}, {1, 0, 0}, {1, 0, 0}})); // 3
	

}

    //2. Copy your arrToString method from before.
    /**Return a String that represets the array in the format:
    * "[2, 3, 4, 9]"
    * Note the comma+space between values, and between values
    */

  public static String arrToString(int[] nums){
    String ans = "[";
    for (int i = 0; i < nums.length; i ++){
      ans += nums[i];
      if (i != nums.length-1){
        ans += ", ";
      }
    }
    return ans += "]";
  }


  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
    public static String arrToString(int[][]ary){
      String ans = "[";
      for (int i = 0; i < ary.length; i++) {
        ans += arrToString(ary[i]);
        if (i != ary.length-1) {
          ans += ", ";
        }
      }
      return ans += "]";
    }

 /*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
		for (int k = 0; k < nums[i].length; k++) {
			sum += nums[i][k];
		}
	}
	return sum;
}

 /**Rotate an array by returning a new array with the rows and columns swapped.
   * You may assume the array is rectangular and neither rows nor cols is 0.
   * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
   */
 public static int[][] swapRC(int[][]nums){
   return new int[1][1];
 }
}
