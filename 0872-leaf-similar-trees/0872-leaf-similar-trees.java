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
    void T2(TreeNode root,List<Integer>l){
        if(root==null)return ;
        if(root.left==null&&root.right==null){
            l.add(root.val);
            // return ;
        }
        T2(root.left,l);
        T2(root.right,l);
        // return ;
    }
  
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       List<Integer>l1=new ArrayList<>();
       List<Integer>l2=new ArrayList<>();
       T2(root1,l1);
       T2(root2,l2);
       return l1.equals(l2);
    }
}