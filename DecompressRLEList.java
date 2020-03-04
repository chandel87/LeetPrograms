/**
 * 1313. Decompress Run-Length Encoded List
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 * 
 * We are given a list nums of integers representing a list compressed with run-length encoding. Consider 
 * each adjacent pair of elements [a, b] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, 
 * there are a elements with value b in the decompressed list.Return the decompressed list.
 */


class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int newArrSize = 0;
        for(int i = 0; i< nums.length; i += 2){
            newArrSize += nums[i];
        }
        
        int[] resultArray = new int[newArrSize];
        int freq = 0, temp = 0, index = 0;
        for(int j = 0; j < nums.length; j += 2){
            freq = nums[j];
            temp = nums[j+1];
            for(int k = 0; k < freq; k++){
                resultArray[index++] = temp;
            }
            freq = 0; temp = 0;
        }
        return resultArray;
    }
}