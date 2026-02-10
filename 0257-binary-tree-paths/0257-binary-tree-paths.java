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
    void sumn(TreeNode root,String sum,List<String>res){
        if(root==null)return ;
        if(sum.isEmpty()){
            sum+=root.val;
        }
        else{
        sum+="->"+root.val;
        }
        if(root.left==null&&root.right==null){
            res.add(sum);
        }
        sumn(root.left,sum,res);
        sumn(root.right,sum,res);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>res=new ArrayList<>();
        sumn(root,"",res);
return res;
    }
}