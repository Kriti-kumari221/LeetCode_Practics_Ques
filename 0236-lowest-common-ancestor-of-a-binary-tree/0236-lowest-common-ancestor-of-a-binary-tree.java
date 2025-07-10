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
    TreeNode Ancestor(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return null;
        }
        if(root==p||root==q){
            return root;
        }
        TreeNode left=Ancestor(root.left,p,q);
        TreeNode right=Ancestor(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }
        if(left!=null){
            return left;
        }
        else{
            return right;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       return  Ancestor(root,p,q);
        
    }
}