import java.util.ArrayList;

public class GraphAdjacencyList {
	// adds an edge (and node)
	// adjacencyList is an ArrayList that has an ArrayList inside of it that has the type Integer. so, kinda like a nested list of some sort.
	static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v) {
		// assume two nodes u and v are adjacent to each other
		// adj is a double nested array, get adj[u], and then add (append) v at that position
		adjacencyList.get(u).add(v);
		// get adj[v], and then (append) u at that position
		adjacencyList.get(v).add(u);
	}

	static void printAdjacencyList(ArrayList<ArrayList<Integer>> adj) {
		for (int i = 0; i < adj.size(); i++) {
			System.out.println("Adjacency list of " + i);
			// remember, you're only looping through the nubmers you inserted 
			for (int j = 0; j < adj.get(i).size(); j++)
				System.out.print(adj.get(i).get(j) + " ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// Creating a graph with 5 vertices
		int V = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<Integer>());

		// Adding edges one by one.
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 4);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 3);
		addEdge(adj, 3, 4);
		printAdjacencyList(adj);
	}
}