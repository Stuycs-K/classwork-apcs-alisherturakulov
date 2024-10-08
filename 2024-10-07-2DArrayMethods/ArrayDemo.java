import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
	System.out.println("Tests for ArrToString---------------------");
    System.out.println(arrToString(new int[][] {{1, 2}, {5, 6}, {0, 3, 5}}));
    System.out.println(arrToString(new int[3][4]));
	System.out.println(arrToString(new int[0][]));
	System.out.println(arrToString(new int[4][0]));
	System.out.println(arrToString(new int[3][3]));
	System.out.println(arrToString(new int[][]{{1, 2, 3, 4}, {2, 65, 5}, {3, 6, 9, 12}, {4, 8, 432, 0, 6, 3, 6, 2}}));
	System.out.println("Same tests using Arrays.toString()--------------");
	System.out.println(Arrays.toString(new int[][] {{1, 2}, {5, 6}, {0, 3, 5}}));
    System.out.println(Arrays.toString(new int[3][4]));
	System.out.println(Arrays.toString(new int[0][]));
	System.out.println(Arrays.toString(new int[4][0]));
	System.out.println(Arrays.toString(new int[3][3]));
	System.out.println(Arrays.toString(new int[][]{{1, 2, 3, 4}, {2, 65, 5}, {3, 6, 9, 12}, {4, 8, 432, 0, 6, 3, 6, 2}}));
	System.out.println("Tests for arr2DSum---------------------");
	System.out.println(arr2DSum(new int[1][1]) + " should be 0"); // should be zero
	System.out.println(arr2DSum(new int[][]{{1, 2, 3}, {1}, {2, 6, 2, 3, 5, 7}, {100}}) + " should be  132"); // should be 132
	System.out.println(arr2DSum(new int[][]{{100, 200, 320}, {0}, {430, 10, 10, 10}, {435}}) + " should be  1515"); //  1515
	System.out.println(arr2DSum(new int[][]{{1, 0, 0}, {1, 0, 0}, {1, 0, 0}}) + " should be  3"); // 3
	System.out.println("Tests for swapRC---------------------");
	System.out.println(arrToString(swapRC(new int[3][4])) + " should be  4 rows 3 columns"); //
	System.out.println(arrToString(swapRC(new int[3][3])) + " should be  3 rows 3 columns"); // should be 3 rows 3  columns of zeroes
	System.out.println(arrToString(swapRC(new int[][]{{1, 2}, {3, 4}, {5, 6}})) + " should be  2 rows 3 columns [[1 3 5], [2 4 6]]"); // should be 2 rows 3 columns
	System.out.println(arrToString(swapRC(new int[][]{{1,2,3},{4,5,6}})) + " should be  3 rows 2 columns {{1,4},{2,5},{3,6}}"); // should be {{1,4},{2,5},{3,6}} 3 rows 2 columns
    System.out.println("Tests for replaceNegative---------------");
	replaceNegative(new int[][]{{-1, 3, 5}, {-5, -2, 8}, {0}}); // should be {{1, 3, 5}, {0, 1, 8}, {0}}
	replaceNegative(new int[][]{{-1, -1, -3, -5}, {-1, 3, -4, -103}, {-2, 500, -432, 100}, {123, 54233, -90, -45}}); // should be {{1, 0, 0, 0}, {0, 3, 0, 0}, {0, 500, 1, 100}, {123, 54233, 0, 1}});
	replaceNegative(new int[][]{{1, 2, 3}, {430, 10, 2}, {40, 102, 2}}); // should be {{1, 2, 3}, {430, 10, 2}, {40, 102, 2}}
	replaceNegative(new int[][]{{-1}, {-2}, {-3}}); // should be {{1}, {0}, {0}}
	replaceNegative(new int[][]{{-400}}); // should be {{1}}
	replaceNegative(new int[][]{{400}}); // should be {{400}}
	System.out.println("Tests for copy---------------"); // to be continued
	copy(new int[3][4]);
	copy(new int[][]{{1, 5, 34, 765}, {0}, {123}, {1, 2, 3, 4, 657}});
	copy(new int[][] {{1, 2}, {5, 6}, {0, 3, 5}});
	copy(new int[][]{{1}});
	copy(new int[1][1]);
    System.out.println("Tests for countZeros2D----------------");
    System.out.println(countZeros2D(new int[][]{{0, 0, 0}, {0, 2, 3, 4, 0, 5, 0}, {1, 2, 3, 4}, {1}, {0}}) + " should be 7");
    System.out.println(countZeros2D(new int[][]{{1}, {1, 2, 3, 4}}) + " should be 0");
    System.out.println(countZeros2D(new int[3][4]) + " should be 12");
    System.out.println("Tests for htmlTable----------------");
    System.out.println();
    System.out.println();

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
	  int count = 0;
	  for (int i = 0; i < nums.length; i++) {
		  for (int j = 0; j < nums[i].length; j++) {
			  if (nums[i][j] == 0) {
				  count++;
			  }
		  }
	  }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
  	for (int i = 0; i < nums.length; i++) {
  		for (int j = 0; j < nums[i].length; j++) {
  			sum += nums[i][j];
  		}
  	}
  	return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    //Is a void method so cant return, must print within and call in main().
  	System.out.println("Before: " + arrToString(vals));
  	for (int i = 0; i < vals.length; i++) {
  		for (int j = 0; j < vals[i].length; j++) {
  			if (vals[i][j] < 0) {
  				if (i == j) {
  					vals[i][j] = 1;
  				} else {
  					vals[i][j] = 0;
  				}
  			}
  		}
  	}
  	System.out.println("After: " + arrToString(vals));
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    System.out.println("In:  " + arrToString(nums));
  	int[][] retAr = new int[nums.length][];
      //cant just reutrn the parameter since the arguments are copied the parameter, but the copy is an address not the actual array.
  	for (int i = 0; i < nums.length; i++){
  		retAr[i] = copy1d(nums[i]);
  	}
  	System.out.print("Ret: " + arrToString(retAr) + "Should be F: "); //prints retAr to check
  	System.out.println(nums == retAr);
  	return retAr;
  }
  
 // 4 Helper: return copy of given 1D array
public static int[] copy1d(int[] nums){
	int[] retAr = new int[nums.length];
	for (int i = 0; i < nums.length; i++){
		retAr[i] = nums[i];
	}
	return retAr;
}

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] retAr = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums[0].length; i++) {
      for (int j = 0; j < nums.length; j++) {
 		     retAr[i][j] = nums[j][i];
 		  }
 	  }
    return retAr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
