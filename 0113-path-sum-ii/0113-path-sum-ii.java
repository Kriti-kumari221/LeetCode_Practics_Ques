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
    void rec(TreeNode root,int tar,int sum,List<List<Integer>>res,List<Integer>out){
       if(root==null)return;
       out.add(root.val);
       sum+=root.val;
       if(root.left==null&&root.right==null){
        if(sum==tar){
            res.add(new ArrayList<>(out));
        }
       }
       rec(root.left,tar,sum,res,out);
       rec(root.right,tar,sum,res,out);
       out.remove(out.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>>res=new ArrayList<>();
    List<Integer>out=new ArrayList<>();
    rec(root,targetSum,0,res,out);
    return res;
    }
}