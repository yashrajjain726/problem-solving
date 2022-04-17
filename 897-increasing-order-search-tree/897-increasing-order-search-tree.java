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
   private TreeNode previous, result;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return result;
    }
    
    private void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            
            if (result == null) {
                result = root;
            } else {
                previous.right = root;
            }
            previous = root;
            root.left = null;
            
            inorder(root.right);
        }
    }
}