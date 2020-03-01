/**
 * 110. Balanced Binary Tree
 * https://leetcode.com/problems/balanced-binary-tree/
 * Given a binary tree, determine if it is height-balanced.For this problem, a height-balanced 
 * binary tree is defined as: a binary tree in which the left and right subtrees of every node 
 * differ in height by no more than 1.
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public boolean isBalanced(TreeNode root) {
        
        if(root == null) return true;
        return findDepth(root) != -1;
    }
    
    public static int findDepth(TreeNode root) {
        
        if(root == null) return 0;
        
        int leftHeight = findDepth(root.left);
        if(leftHeight == -1) return -1;
        
        int rightHeight = findDepth(root.right);
        if(rightHeight == -1) return -1;
        
        if(Math.abs(rightHeight - leftHeight) > 1) return -1;
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}