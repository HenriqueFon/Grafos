import java.util.*;

public class Dijkstra {

    private static final int INFINITY = Integer.MAX_VALUE;

    private Map<Integer, List<Edge>> graph;

    public Dijkstra(Map<Integer, List<Edge>> graph) {
        this.graph = graph;
    }

    public Map<Integer, Integer> shortestPaths(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        Map<Integer, Integer> distances = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        for (int vertex : graph.keySet()) {
            if (vertex == start) {
                distances.put(vertex, 0);
            } else {
                distances.put(vertex, INFINITY);
            }
        }

        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int vertex = node.vertex;
            int distance = node.distance;

            if (visited.contains(vertex)) {
                continue;
            }

            visited.add(vertex);

            for (Edge edge : graph.get(vertex)) {
                int to = edge.to;
                int weight = edge.weight;

                if (!visited.contains(to)) {
                    int newDistance = distance + weight;
                    int oldDistance = distances.get(to);

                    if (newDistance < oldDistance) {
                        distances.put(to, newDistance);
                        pq.offer(new Node(to, newDistance));
                    }
                }
            }
        }

        return distances;
    }

    public static class Node implements Comparable<Node> {
        private final int vertex;
        private final int distance;
    
        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    
        public int compareTo(Node other) {
            return Integer.compare(distance, other.distance);
        }
    }

    public static class Edge {
        int to;
        int weight;
    
        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}
