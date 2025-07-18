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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       List<List<Integer>>res=new ArrayList<>();
       if(root==null){
        return res;
       }
       Queue<TreeNode>queue=new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
        int level=queue.size();
        List<Integer>levell=new ArrayList<>();
        for(int i=0;i<level;i++){
            TreeNode curr=queue.remove();
            levell.add(curr.val);
        
        if(curr.left!=null){
            queue.add(curr.left);
        }
        if(curr.right!=null){
            queue.add(curr.right);
        }
        }
        res.add(0,levell);

       }
       return res;
    }
}
