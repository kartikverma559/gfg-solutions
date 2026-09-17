class Solution {
    public int minimumEdgeReversal(int[][] edges, int n, int src, int dst) {

        List<List<int[]>> graph = new ArrayList<>();

        // Create adjacency list
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            // Original direction: u -> v, cost 0
            graph.get(u).add(new int[]{v, 0});

            // Reverse direction: v -> u, cost 1
            graph.get(v).add(new int[]{u, 1});
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Deque<Integer> dq = new ArrayDeque<>();

        dist[src] = 0;
        dq.addFirst(src);

        while (!dq.isEmpty()) {

            int node = dq.pollFirst();

            for (int[] next : graph.get(node)) {

                int neighbour = next[0];
                int cost = next[1];

                if (dist[node] + cost < dist[neighbour]) {

                    dist[neighbour] = dist[node] + cost;

                    // Cost 0 -> front
                    if (cost == 0) {
                        dq.addFirst(neighbour);
                    }
                    // Cost 1 -> back
                    else {
                        dq.addLast(neighbour);
                    }
                }
            }
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}