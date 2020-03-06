/**
 * https://leetcode.com/problems/range-sum-of-bst/submissions/
 * 938. Range Sum of BST
 * 
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between 
 * L and R (inclusive). The binary search tree is guaranteed to have unique values.
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
    // Solution 1
    public static int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        calRangeSumBST(root, L, R);
        return sum;
    }
    
    public static void calRangeSumBST(TreeNode root, int L, int R){
        if(root == null) return ;
        calRangeSumBST(root.left, L, R);
        calRangeSumBST(root.right, L, R);
        if(root.val >= L && root.val <= R){
            sum += root.val;
        }
    }

    // Solution 2: DFS approach
    public int rangeSumBST2(TreeNode root, int L, int R) {
        int res = 0;
        if(root == null) return 0;
        if(root.val>= L && root.val<=R){
            res += root.val;
        }
        return res + rangeSumBST(root.right,L,R) + rangeSumBST(root.left,L,R);
    }
}