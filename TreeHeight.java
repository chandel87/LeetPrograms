/**
 * 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Given a binary tree, find its maximum depth. The maximum depth is the number of nodes along the 
 * longest path from the root node down to the farthest leaf node.Note: A leaf is a node with no children.
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
    // Recursive Solution
    public int heightOfTree(TreeNode root) {

        if(root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return (Math.max(left,right) + 1);
    }

    // Iterative Solution
    public int heightOfTree(TreeNode root) {

        if(root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while( queue.size() > 0 ) {
            int size = queue.size();
            depth++;
            for(int i=1; i<=size; i++){
                TreeNode temp = queue.poll();
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
            }
        }
        return depth;
    }
}