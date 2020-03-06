/**
 * https://leetcode.com/problems/maximum-69-number/submissions/
 * 1323. Maximum 69 Number
 * Given a positive integer num consisting only of digits 6 and 9. Return the maximum number you can get 
 * by changing at most one digit (6 becomes 9, and 9 becomes 6).
 */

class Solution {
    public int maximum69Number (int num) {
        Integer i = new Integer(num);
        String str = i.toString();
        int length = str.length();

        switch(str.indexOf('6')){

            case 0 : num += 3*Math.pow(10,length - 1); break;

            case 1 : num += 3*Math.pow(10,length - 2); break;

            case 2 : num += 3*Math.pow(10,length - 3); break;

            case 3 : num += 3*Math.pow(10,length - 4); break;

            default : return num;
        }
        return num;
    }
}