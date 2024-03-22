/*
Problem:

Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
*/

//Solution:

public class Kata {
  public static int[] digitize(long n) {
        int[] result = new int[("" + n).length()];
        for (int i = 0; n > 0; i++) {
            result[i] = (int)(n % 10);
            n /= 10;
        }
        return result;
  }
}