/**
 * https://leetcode.com/problems/jewels-and-stones/
 * You're given strings J representing the types of stones that are jewels, and S representing the 
 * stones you have.  Each character in S is a type of stone you have.  You want to know how many of 
 * the stones you have are also jewels. The letters in J are guaranteed distinct, and all characters 
 * in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 */

class Solution {
    // Solution 1 : beats 100% of submissions
    public int numJewelsInStones(String J, String S) {
        char[] stones = S.toCharArray();
        int numJewelsInStones = 0;

        for(char stone : stones) {
            if(J.indexOf(stone) >= 0) {
                numJewelsInStones++;
            }
        }
        return numJewelsInStones;
    }

    /* Solution 2
    public int numJewelsInStones(String J, String S) {
        
        char []jc = J.toCharArray();
        char []sc = S.toCharArray();
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char s : sc) {
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
            else map.put(s,1);
        }
        
        for(char j : jc){
            if(map.containsKey(j) && map.get(j) > 0) {
                count += map.get(j);
                map.put(j,0);
            }
        }
        return count;
    }
    */
}
