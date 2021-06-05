public class Main {
    public static void main(String[] args) {

        MyGraph<String> graph = new MyGraph<>();

        graph.addEdge("Almaty", "Astana");
        graph.addEdge("Almaty", "Shymkent");
        graph.addEdge("Shymkent", "Astana");
        graph.addEdge("Astana", "Kostanay");
        graph.addEdge("Shymkent", "Kyzylorda");

        for (String v : graph.adj()) {
            System.out.println(v);
        }

        System.out.println(graph.getEdgesCount());
        System.out.println(graph.getVerticesCount());
        System.out.println(graph.hasEdge("Astana", "Almaty"));

    }
}
