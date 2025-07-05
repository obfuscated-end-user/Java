import java.util.LinkedList;
import java.util.Iterator;

// bfs is the one with the layer like thing
public class BFS {
	private int Vertices;				   // No. of vertices
	private LinkedList<Integer> adj_list[]; // Adjacency Lists

	// graph Constructor: number of vertices in graph are passed
	BFS(int v) {
		Vertices = v;
		adj_list = new LinkedList[v];
		for (int i = 0; i < v; ++i) // create adjacency lists
			adj_list[i] = new LinkedList();
	}

	// add an edge to the graph
	void addEdge(int v, int w) {
		adj_list[v].add(w);
	}

	// BFS traversal from the root_node
	void BFS_helper(int root_node) {
		// initially all vertices are not visited
		boolean visited[] = new boolean[Vertices];

		// BFS queue
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// current node = visited, insert into queue
		// if this line still messes with your head, yes, you're right that it's literally accessing the position of visited[root_node] and setting it to true. yes, they used it as an index in this context. the point is that all other nodes contain false, except this node and some other nodes.
		visited[root_node] = true;
		queue.add(root_node);

		while (queue.size() != 0) {
			// deque an entry from queue and process it
			// root_node is now what was on the last item of the queue
			root_node = queue.poll();
			System.out.print(root_node + " ");

			// get all adjacent nodes of current node and process
			// some iterator that makes the code below do its magic
			Iterator<Integer> i = adj_list[root_node].listIterator();
			// while there are nodes left
			while (i.hasNext()) {
				// n is the next item in the iterator
				int n = i.next();
				// if not visited yet
				if (!visited[n]) {
					// set that to be visited
					visited[n] = true;
					// and add it to the queue
					queue.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {

		//create a graph with 7 vertices
		BFS g = new BFS(7);
		//add edges to the graph
		g.addEdge(0, 1);
		g.addEdge(0, 5);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		g.addEdge(1, 5);
		g.addEdge(2, 4);
		g.addEdge(2, 6);
		//print BFS sequence
		System.out.println("Breadth-first traversal of graph with 0 as starting vertex:");
		g.BFS_helper(0);
	}
}