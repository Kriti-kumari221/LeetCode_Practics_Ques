class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> res = new ArrayList<>();

        int right = matrix[0].length - 1;
        int bot = matrix.length - 1;
        int left = 0;
        int top = 0;

        while (top <= bot && left <= right) {

            // → Left to Right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // ↓ Top to Bottom
            for (int i = top; i <= bot; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            // ← Right to Left
            if (top <= bot) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bot][i]);
                }
                bot--;
            }

            // ↑ Bottom to Top
            if (left <= right) {
                for (int i = bot; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
    }
}