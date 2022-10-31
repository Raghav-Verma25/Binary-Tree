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
    List<String> list = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String s="";
        return helper(root,s);
    }
    public List<String> helper(TreeNode root , String str){
        if(root==null){
            return list;
        }
        if(root.left==null && root.right==null){
            str = str + root.val;
            list.add(str);
            return list;
        }
        else{
            str = str + root.val + "->" ;
        }
              
        helper(root.left,str);
        helper(root.right , str);
        return list;
    }
}
