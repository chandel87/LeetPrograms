/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * 
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 */

class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum = 0;
        int mul = 1;
        while(n != 0){
            int temp = n % 10;
            n /= 10;
            sum += temp;
            mul *= temp;
        }
        return mul - sum;
    }
}