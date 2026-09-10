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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        diameterOfBT(root, diameter);
        return diameter[0];
    }

    private int diameterOfBT(TreeNode root, int[] diameter) {
        if(root == null) {
            return 0;
        }

        int lh = diameterOfBT(root.left, diameter);
        int rh = diameterOfBT(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh+rh);
        return Math.max(lh, rh)+1;
    }
}