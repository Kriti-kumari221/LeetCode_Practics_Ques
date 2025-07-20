import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        int ans = 0;

        while (queue.size() > 0) {
            int size = queue.size();
            boolean flag = false;

            for (int i = 0; i < size; i++) {
                int[] node = queue.remove();
                for (int j = 0; j < 4; j++) {
                    int x = node[0] + dx[j];
                    int y = node[1] + dy[j];

                    if (x >= 0 && y >= 0 && x < n && y < m && grid[x][y] == 1) {
                        queue.add(new int[]{x, y});
                        grid[x][y] = 2;
                        fresh--;
                        flag = true;
                    }
                }
            }

            if (flag) {
                ans++;
            }
        }

        if (fresh == 0) {
            return ans;
        }

        return -1;
    }
}
