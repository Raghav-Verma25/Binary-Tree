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
    boolean res;
    public boolean isBalanced(TreeNode root) {
        res=true;
        height(root);
        return res;
        
    }
        public int height(TreeNode root){
            if(root==null){
                return 0;
            }
            if(root.left==null && root.right==null){
                return 1;
            }
            else{
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            if(Math.abs(leftHeight-rightHeight) > 1){
                res=false;
            }
            
            return 1+Math.max(leftHeight,rightHeight);
            }
    }
}
