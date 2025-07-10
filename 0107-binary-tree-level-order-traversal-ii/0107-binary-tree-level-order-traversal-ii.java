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
    void rec(List<List<Integer>>res,TreeNode root,int level){
        if(root==null){
            return;
        }
        if(res.size()==level){
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        rec(res,root.left,level+1);
        rec(res,root.right,level+1);

    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        rec(res,root,0);
        Collections.reverse(res);
        return res;
    }
}