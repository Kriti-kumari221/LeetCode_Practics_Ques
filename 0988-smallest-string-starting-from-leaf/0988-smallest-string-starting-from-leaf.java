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
    String result="~";
    void small(TreeNode root,StringBuilder sum){
        if(root==null){
            return;
        }
        sum.insert(0,(char)('a'+root.val));
        if(root.left==null&&root.right==null){
            String curr=sum.toString();
            if(curr.compareTo(result)<0){
                result=curr;
            }
            
        }
        small(root.left,sum);
        small(root.right,sum);
        sum.deleteCharAt(0);
    }
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder sum=new StringBuilder();
        small(root,sum);
        return result;
    }
}