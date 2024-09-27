public class MyArrays{
  public static void main(String[] args){
    System.out.println(aryToString(new int[]{1, 2, 3, 4, 5}));
  }
  /**
*Convert an array into a String that consists of the
*array's elements enclosed in square brackets "[]".
*Adjacent elements are separated by the characters ", "
*@return a String formatted like: "[4, 9, 11]"
*/
public static String aryToString(int[] nums){
  String start = "[";
  for (int i = 0; i < nums.length; i++) {
    if (i == 0) {
      start += nums[i] + ", ";
    } else if (i == (nums.length-1)) {
      start += nums[i];
    }
  }
  return start + "]";
}


}
