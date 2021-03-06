/*    
    https://leetcode.com/problems/trim-a-binary-search-tree/
    Given a binary search tree and the lowest and highest boundaries as L and R, 
    trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change 
    the root of the tree, so the result should return the new root of the trimmed binary search tree.

    Example 1:
    Input: 
         1
        / \
       0   2
    
    L = 1, R = 2
    Output: 
        1
         \
          2
*/

class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) return null;
        
        if(root.val >= L && root.val <= R) {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            return root;
        } else if(root.val < L){
            return trimBST(root.right, L, R);
        } else {
            return trimBST(root.left, L, R);
        }
    }
}
