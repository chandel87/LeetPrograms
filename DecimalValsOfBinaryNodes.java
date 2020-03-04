/**
 * 1290. Convert Binary Number in a Linked List to Integer
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * 
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list 
 * is either 0 or 1. The linked list holds the binary representation of a number. Return the decimal value 
 * of the number in the linked list.
 */

 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> binaryVals = new ArrayList<Integer>();
        ListNode cur = head;
        while(cur != null){
            binaryVals.add(cur.val);
            cur = cur.next;
        }
        int result = 0;
        int size = binaryVals.size() -1;
        for(Integer val : binaryVals){
            result += val * Math.pow(2,size--);
        }
        return result;
    }
}