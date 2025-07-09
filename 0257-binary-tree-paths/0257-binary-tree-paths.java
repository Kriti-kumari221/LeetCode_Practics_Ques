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
    void binary(List<String>s,TreeNode root,String sum){
        if(root==null){
            return ;
        }
       if(sum.isEmpty()){
        sum+=root.val;
       }
       else{
        sum+="->"+root.val;
       }
        if(root.left==null&&root.right==null){
            s.add(sum);
        }
        binary(s,root.left,sum);
        binary(s,root.right,sum);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>s=new ArrayList<>();
         binary(s,root,"");
        return s;
    }
}