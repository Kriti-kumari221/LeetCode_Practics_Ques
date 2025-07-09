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
    void path(List<List<Integer>>res,List<Integer>output,TreeNode root,int targetSum,int sum){
        if(root==null){
            return ;
        }
        output.add(root.val);
        sum=sum+root.val;
        if(root.left==null&&root.right==null){
            if(targetSum==sum){
                res.add(new ArrayList<>(output));
            }

        }
        path(res,output,root.left,targetSum,sum);
        path(res,output,root.right,targetSum,sum);
        output.remove(output.size()-1);



    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>output=new ArrayList<>();
        path(res,output,root,targetSum,0);
        return res;
    }
}