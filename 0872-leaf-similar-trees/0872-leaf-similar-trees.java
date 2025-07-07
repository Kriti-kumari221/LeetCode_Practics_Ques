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
    List<Integer> in(TreeNode root,List<Integer>roott){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            roott.add(root.val);
        }
        in(root.left,roott);
        in(root.right,roott);
        return roott;

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
       in(root1,l1);
        in(root2,l2);
        if(l1.equals(l2))return true;
        return false;
    }
}