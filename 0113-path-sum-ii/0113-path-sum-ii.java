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
    void rec(TreeNode root,List<List<Integer>>res,List<Integer>list,int targetSum,int sum){
        if(root==null){
            return ;
        }
        list.add(root.val);
        sum=sum+root.val;
        if(root.left==null&&root.right==null){
            if(targetSum==sum){
                res.add(new ArrayList<>(list));
            }
        }
        rec(root.left,res,list,targetSum,sum);
        rec(root.right,res,list,targetSum,sum);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>output=new ArrayList<>();
        rec(root,res,output,targetSum,0);
        return res;
    }
}