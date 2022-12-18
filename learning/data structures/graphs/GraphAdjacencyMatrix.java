public class GraphAdjacencyMatrix {
    int vertex;
    int matrix[][];

    // just like a matrix, you need a nested list
    GraphAdjacencyMatrix(int vertex) {
        this.vertex = vertex;
        // you know, your matrix should like a square, equal height and width
        matrix = new int[vertex][vertex];
    }

    void addEdge(int source, int destination) {
        // you assign 1 to this because remember, you're marking the nodes that have a connection to each other, otherwise 0. we also don't need to assign 0 to unoccupied spaces because Java automatically does that shit for us.
        // add edge
        matrix[source][destination] = 1;
        // add back edge for undirected graph
        matrix[destination][source] = 1;
    }

    void printGraph() {
        System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex ; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        for (int i = 0; i < vertex; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            // loop through the list again
            for (int j = 0; j < vertex; j++) {
                // and only print if there is a connection (i.e. 1), ignore otherwise
                if (matrix[i][j] == 1)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();
    }
}