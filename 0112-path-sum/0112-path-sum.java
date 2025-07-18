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
   boolean tell=false;
   void summ(TreeNode root, int targetSum,int sum){
 if(root==null){
            return ;
        }
        sum=sum+root.val;
        if(root.left==null&&root.right==null){
            if(sum==targetSum){
                tell=true;
            }
            return;
        }
       summ(root.left, targetSum, sum);
       summ(root.right, targetSum, sum);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        tell=false;
        summ(root,targetSum,0);
        return tell;
       
    }
}