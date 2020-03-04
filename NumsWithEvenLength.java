/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * 1295. Find Numbers with Even Number of Digits
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */


class Solution {
    // Aprroach 1: Runtime: 2 ms, faster than 94.24% and Memory Usage: 39.2 MB, less than 100.00%
    public int findNumbers1(int[] nums) {
        int count = 0;
        for(int n : nums){
            int length = 0;
            while(n != 0){
                n /= 10;
                length++;
            }
            if(length % 2 == 0){
               count++;
            }
       }
       return count;
    }

    // Aprroach 2: Runtime: 2 ms, faster than 30.87% and Memory Usage: 40.7 MB, less than 100.00%
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
            Integer temp = new Integer(n);
            String str = temp.toString();
            int length = str.length();
            if(length % 2 == 0){
                count++;
            }
        }
        return count;
    }
}