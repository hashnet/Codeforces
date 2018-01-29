import java.util.*;

public class Main {
	private static class Tree<T> {
		private Node<T> root;
		
		public void setRoot(Node<T> root) {
			this.root = root;
		}
		
		private static class Node<T> {
			private T data;
			private List<Node<T>> children;
			private List<Node<T>> adjs;
			
			public Node(T data) {
				this.data = data;
				children = new LinkedList<Node<T>>();
				adjs = new LinkedList<Node<T>>();
			}
			
			public T getData() {
				return data;
			}
			
			public void addChild(Node<T> child) {
				children.add(child);
			}
			
			public void addAdjs(Node<T> adj) {
				adjs.add(adj);
			}
		}
	}
	
	private static class Vertex {
		private int index;
		private boolean hasCat;
		
		public Vertex(int index){
			this.index = index;
		}
		
		public void setCatStatus(boolean hasCat) {
			this.hasCat = hasCat;
		}
		
		public boolean getCatStatus() {
			return hasCat;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Tree.Node<Vertex>[] nodes = new Tree.Node[n];
		int hasCat;
		for(int i=0; i<n; i++) {
			hasCat = sc.nextInt();
			nodes[i] = new Tree.Node<Vertex>(new Vertex(i));
			nodes[i].data.setCatStatus(hasCat == 0 ? false : true);
		}
		
		Tree<Vertex> park = new Tree<Vertex>();
		park.setRoot(nodes[0]);
		
		for(int i=0; i<n-1; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			nodes[a].addAdjs(nodes[b]);
			nodes[b].addAdjs(nodes[a]);
		}
		
		prepareTree(nodes[0]);
	
		System.out.println();
	}
	
	public static void prepareTree(Tree.Node<Vertex> parent) {
		for(Tree.Node<Vertex> child : parent.adjs) {
			if(child.data.index != parent.data.index && child.children.size() == 0) {
				parent.children.add(child);
			}
		}
		
		for(Tree.Node<Vertex> child : parent.children) {
			prepareTree(child);
		}
	}
}
