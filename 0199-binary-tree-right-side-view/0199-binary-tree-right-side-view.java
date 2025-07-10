class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode curr = queue.remove();
                if (i == level - 1) {
                    list.add(curr.val); 
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }

        return list;
    }
}
// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         dfs(root, 0, result);
//         return result;
//     }

//     private void dfs(TreeNode node, int depth, List<Integer> result) {
//         if (node == null) return;

//         // First time we reach this depth → rightmost node
//         if (depth == result.size()) {
//             result.add(node.val);
//         }

//         // Right first to prioritize right view
//         dfs(node.right, depth + 1, result);
//         dfs(node.left, depth + 1, result);
//     }
// }
