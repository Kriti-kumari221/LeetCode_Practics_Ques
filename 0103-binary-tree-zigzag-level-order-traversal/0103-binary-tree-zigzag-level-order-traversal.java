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
    void zig(TreeNode root,List<List<Integer>>res,int level){
        if(root==null)return ;
        if(res.size()==level){
            res.add(new ArrayList<>());
        }
        if(level%2==0){
            res.get(level).addLast(root.val);
        }else{
            res.get(level).addFirst(root.val);
        } 
        zig(root.left,res,level+1);
        zig(root.right,res,level+1);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        zig(root,res,0);
        return res;
    }
}