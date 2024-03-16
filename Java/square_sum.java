/*
Problem:

Complete the square sum function so that it squares each number passed into it and then sums the results together.
*/

//Solution:

public class Kata {
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int num : n) {
            sum += num * num; // Squaring each number and adding to the sum
        }
        return sum;
    }
}