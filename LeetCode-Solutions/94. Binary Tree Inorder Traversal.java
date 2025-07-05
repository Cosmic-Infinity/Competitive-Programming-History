//0ms 41.70mb

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        inhelp(root, lst);
        return lst;
    }

    void inhelp(TreeNode root, List<Integer> lst) {
        if (root == null)
            return;
        inhelp(root.left, lst);
        lst.add(root.val);
        inhelp(root.right, lst);
    }
}