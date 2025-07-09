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
    boolean summ(TreeNode root, int targetSum,int sum){
 if(root==null){
            return false;
        }
        sum=sum+root.val;
        if(root.left==null&&root.right==null){
            if(sum==targetSum){
                return true;
            }
        }
       return summ(root.left, targetSum, sum) || summ(root.right, targetSum, sum);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return summ(root,targetSum,0);
       
    }
}