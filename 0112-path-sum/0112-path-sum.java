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
    void  sumn(TreeNode root,int tar,int sum){
        if(root==null){
            return ;
        }
        sum+=root.val;
        if(root.left==null&&root.right==null){
            if(sum==tar){
                tell=true;
                return;
            }
        }
        
        sumn(root.left,tar,sum);
        sumn(root.right,tar,sum);
        
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        sumn(root,targetSum,0);
        return tell;
    }
}