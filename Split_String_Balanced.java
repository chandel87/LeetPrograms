/* 
    https://leetcode.com/problems/split-a-string-in-balanced-strings/
    
    Balanced strings are those who have equal quantity of 'L' and 'R' characters.
    Given a balanced string s split it in the maximum amount of balanced strings.
    Return the maximum amount of splitted balanced strings.
    "RLRRLLRLRL"
*/

class Solution {
    
    public int balancedStringSplit(String s) {
        char []charArr = s.toCharArray();
        int l=0, r=0, count=0;
        for(char ch : ch){
            if(ch == 'L'){
                l++;
            } else {
                r++;
            }
            if(r == l){
                count++;
                l = r = 0;
            }
        }
    }
}
