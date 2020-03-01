/**
 * https://leetcode.com/problems/leaf-similar-trees/
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
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
    // Approach 1 : beats 100% of the submissions
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaves1 = new ArrayList<Integer>();
        ArrayList<Integer> leaves2 = new ArrayList<Integer>();
        
        getAllLeaves(root1, leaves1);
        getAllLeaves(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public static void getAllLeaves(TreeNode root, ArrayList<Integer> leaveNodes) {
        if(root != null) {
            if(root.left == null && root.right == null)
                leaveNodes.add(root.val);
            getAllLeaves(root.left, leaveNodes);
            getAllLeaves(root.right, leaveNodes);
        }
    }

    // Approach 2 : beats 100% of the submissions
    /*
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaves1 = new ArrayList<Integer>();
        ArrayList<Integer> leaves2 = new ArrayList<Integer>();

        getAllLeaves(root1, leaves1);
        getAllLeaves(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public static ArrayList<Integer> getAllLeaves(TreeNode root, ArrayList<Integer> leaveNodes) {
        if(root == null) return new ArrayList<Integer>();
        
        if(root.left == null && root.right == null){
            leaveNodes.add(root.val);
        }
        getAllLeaves(root.left, leaveNodes);
        getAllLeaves(root.right, leaveNodes);
        return leaveNodes;
    }*/


    // Approach 3 : beats 10% of the submissions
    /*
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List list1 = getAllLeafs(root1, new ArrayList<Integer>());
        List list2 = getAllLeafs(root2, new ArrayList<Integer>());
        
        if(list1.size() != list2.size()) return false;
        else {
            for(int i=0; i<list1.size(); i++){
                if(list1.get(i) == list2.get(i)) continue;
                else return false;
            }
            return true;
        }
    }
    
    public static List<Integer> getAllLeafs(TreeNode root, List list) {
        if(root == null) return list;
        
        getAllLeafs(root.left, list);
        if(root.left == null && root.right == null) list.add(root.val);
        getAllLeafs(root.right, list);
        
        return list;
    }*/
}
        