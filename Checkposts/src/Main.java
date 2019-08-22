import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	private class Graph {
		private int V;
		private List<List<Integer>> edges;
		private List<List<Integer>> revEdges;
		private boolean[] visited;
		
		public Graph(int v) {
			this.V = v;
			
			visited = new boolean[V];
		
			edges = new ArrayList<>();
			for(int i=0; i<V; i++) {
				edges.add(new ArrayList<>());
			}
			
			revEdges = new ArrayList<>();
			for(int i=0; i<V; i++) {
				revEdges.add(new ArrayList<>());
			}
		}
		
		public void addEdge(int from, int to) {
			edges.get(from).add(to);
			revEdges.get(to).add(from);
		}
		
		public List<List<Integer>> getStrongComponents() {
			List<List<Integer>> sComponents = new ArrayList<>();
			
			Deque<Integer> topo = new ArrayDeque<>();
			for(int vertex=0; vertex<V; vertex++) {
				if(!visited[vertex]) {
					topoDFS(vertex, topo, edges);
				}
			}
			//System.out.println("Topo sorted: " + topo);
			
			resetVisited();
			for(int vertex : topo) {
				if(!visited[vertex]) {
					List<Integer> group = new ArrayList<>();
					componentDFS(vertex, group, revEdges);
					sComponents.add(group);
				}
			}
			
			//System.out.println("Strong Components: " + sComponents);
			return sComponents;
		}
		
		private void componentDFS(int vertex, List<Integer> group, List<List<Integer>> edges) {
			visited[vertex] = true;
			group.add(vertex);
			
			for(int next : edges.get(vertex)) {
				if(!visited[next]) {
					componentDFS(next, group, edges);
				}
			}
		}
		
		private void topoDFS(int vertex, Deque<Integer> topo, List<List<Integer>> edges) {
			visited[vertex] = true;
			
			for(int next : edges.get(vertex)) {
				if(!visited[next]) {
					topoDFS(next, topo, edges);
				}
			}
			
			topo.push(vertex);
		}
		
		private void resetVisited() {
			for(int i=0; i<V; i++) {
				visited[i] = false;
			}
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			
			sb.append(String.format("V = {0}\n", V));
			sb.append("Normal edges:\n");
			sb.append(edges + "\n");
			sb.append("Reverse edges:\n");
			sb.append(revEdges + "\n");
			
			return sb.toString();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] cost = new long[n];
		for(int i=0; i<n; i++) {
			cost[i] = sc.nextLong();
		}
		
		Graph g = new Main().new Graph(n);
		
		int m = sc.nextInt();
		for(int i=0; i<m; i++) {
			g.addEdge(sc.nextInt()-1, sc.nextInt()-1);
		}
		
		//System.out.println(g);
		
		List<List<Integer>> sComponents = g.getStrongComponents();
		long totalComb = 1;
		long minCost = 0;
		for(List<Integer> group : sComponents) {
			long min = Long.MAX_VALUE;
			for(int vertex : group) {
				if(cost[vertex] < min) min = cost[vertex];
			}
			
			minCost += min;
			
			long comb = 0;
			for(int vertex : group) {
				if(cost[vertex] == min) ++comb;
			}
			
			totalComb = (totalComb * comb) % 1000000007;
		}
		
		System.out.println(minCost + " " + totalComb);
		sc.close();
	}
}
