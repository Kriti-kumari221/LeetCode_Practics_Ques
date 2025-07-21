class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int cost = flight[2];
            adj.get(u).add(new int[]{v, cost});
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{src, 0, 0});
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0];
            int costSoFar = curr[1];
            int stops = curr[2];
            if (stops > k) continue;
            for (int[] neighbour : adj.get(node)) {
                int nextNode = neighbour[0];
                int price = neighbour[1];
                if (costSoFar + price < dist[nextNode]) {
                    dist[nextNode] = costSoFar + price;
                    q.add(new int[]{nextNode, costSoFar + price, stops + 1});
                }
            }
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}  