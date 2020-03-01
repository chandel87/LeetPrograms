/**
 * https://leetcode.com/problems/keyboard-row/
 * Given a List of words, return the words that can be typed using letters of 
 * alphabet on only one row's of American keyboard like the image below.
 * 
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 */

class Solution {
    // Solution 1 : beats 100% of submissions
    public String[] findWords(String[] words) {
        String stringToLook = "";
        ArrayList<String> matchedStr = new ArrayList<String>();
        int count = 0;
        for(String word : words){
            char[] wordChar = word.toCharArray();
            stringToLook = rowToLook(wordChar[0]);
            for(char ch : word.toCharArray()){
                if(stringToLook.indexOf(ch) >= 0){
                    count++;
                    continue;
                }
                else break;
            }
            if(count == word.length()){
                matchedStr.add(word);
            }
            count = 0;
        }
        return matchedStr.toArray(new String[matchedStr.size()]);
    }
    
    public static String rowToLook(char ch){
        String row1 = "QWERTYUIOPqwertyuiop";
        String row2 = "ASDFGHJKLasdfghjkl";
        String row3 = "ZXCVBNMzxcvbnm";
        
        if(row1.indexOf(ch) >= 0) {
            return row1;
        } if(row2.indexOf(ch) >= 0) {
            return row2;
        } else {
            return row3;
        }
    }
}