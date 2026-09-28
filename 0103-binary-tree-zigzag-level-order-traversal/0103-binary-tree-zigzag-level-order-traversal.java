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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        boolean direction = true;

        while(!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> row = new LinkedList<>();

            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if(direction) {
                    row.addLast(node.val);
                } else {
                    row.addFirst(node.val);
                }

                if(node.left != null) {
                    q.offer(node.left);
                }
                if(node.right != null) {
                    q.offer(node.right);
                }
            }

            direction = !direction;
            result.add(row);
        }

        return result;
    }
}