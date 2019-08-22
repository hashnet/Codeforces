import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	private class DLL {
		private class Node {
			int val;
			Node prev;
			Node next;
			
			public Node() {
				this(-1);
			}
			
			public Node(int val) {
				this.val = val;
			}
		}
		
		private Node root;
		public DLL() {
			root = new Node();
			root.next = new Node();
			root.next.prev = root;
		}
		
		public Node getRoot() {
			return root;
		}
		
		public Node insert(Node left, int num) {
			Node newNode = new Node(num);
			Node right = left.next;
			
			left.next = newNode;
			newNode.prev = left;
			right.prev = newNode;
			newNode.next = right;
			
			return newNode;
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		
		String str = br.readLine();
		
		DLL dll = new Main().new DLL();
		DLL.Node node = dll.getRoot();
		for(int i=0; i<str.length(); i++) {
			DLL.Node newNode = dll.insert(node, i+1);
			if(str.charAt(i) == 'r') {
				node = newNode;
			}			
		}
		
		StringBuilder sb = new StringBuilder();
		node = dll.getRoot().next;
		
		while(node.val > 0) {
			sb.append(node.val + "\n");
			node = node.next;
		}
		
		pr.print(sb);
		
		pr.close();
		br.close();
	}	
}
