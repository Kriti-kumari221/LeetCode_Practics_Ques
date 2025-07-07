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
    int in(TreeNode root,int[] sum){
        if(root==null){
            return 0;
        }
          if (root.left != null && root.left.left == null && root.left.right == null) {
            sum[0] += root.left.val;
        }
        in(root.left,sum);
        in(root.right,sum);
return sum[0];
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int []sum=new int[1];
        in(root,sum);
        return sum[0];
    }
}