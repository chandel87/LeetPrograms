/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * 700. Search in a Binary Search Tree
 * Given the root node of a binary search tree (BST) and a value. You need to find the node in 
 * the BST that the node's value equals the given value. Return the subtree rooted with that node. 
 * If such node doesn't exist, you should return NULL.
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
    // recursive implementation
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;

        if(root.val == val) return root;
        if(root.val > val) return searchBST(root.left, val);
        if(root.val < val) return searchBST(root.right, val);

        return null;
    }

    // iterative approach
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size() > 0) {
            TreeNode node = queue.poll();
            if(node.val == val) return node;
            else {
                if(node.val > val && node.left != null) queue.add(node.left);
                if(node.val < val && node.right != null) queue.add(node.right);
            }
        }
        return null;
    }
}