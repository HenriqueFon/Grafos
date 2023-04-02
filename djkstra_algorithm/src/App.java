import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Map<Integer, List<Dijkstra.Edge>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(
                new Dijkstra.Edge(2, 2),
                new Dijkstra.Edge(3, 4)
        ));

        graph.put(2, Arrays.asList(
                new Dijkstra.Edge(4, 7),
                new Dijkstra.Edge(3, 1)
        ));

        graph.put(3, Arrays.asList(
                new Dijkstra.Edge(4, 3)
        ));

        graph.put(4, Arrays.asList(
                new Dijkstra.Edge(5, 2)
        ));

        graph.put(5, Collections.emptyList());

        Dijkstra dijkstra = new Dijkstra(graph);
        Map<Integer, Integer> distances = dijkstra.shortestPaths(1);

        System.out.println(distances); // Output: {1=0, 2=2, 3=3, 4=6, 5=8}
    }
}
