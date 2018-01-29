import java.util.*;

public class Main {
	public static class Node {
		int id;
		int color;
		
		List<Node> next = new ArrayList<Node>();
		
		public Node(int id) {
			this.id = id;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Node> tree = new ArrayList<Node>();
		for(int i=0; i<n; i++) {
			tree.add(new Node(i));
		}
		
		for(int i=1; i<n; i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			
			tree.get(u).next.add(tree.get(v));
			tree.get(v).next.add(tree.get(u));			
		}
		
		for(int i=0; i<n; i++) {
			tree.get(i).color = sc.nextInt();
		}
		
/*		for(int i=0; i<n; i++) {
			System.out.println(tree.get(i).id + " : " + tree.get(i).color);
			for(Node c : tree.get(i).next) {
				System.out.print(" -> " + c.id + " : " + tree.get(i).color);
			}
			System.out.println();
		}*/
		
		boolean found = false;
		int i;
		for(i=0; i<n; i++) {
			Node root = tree.get(i);
			
			/*boolean matching = true;
			for(Node branch : root.next) {
				if(check(branch, root, branch.color) == false) {
					matching = false;
					break;
				}
			}*/
			
			if(matching == true) {
				found = true;
				break;
			}
		}
		
		if(found == true) {
			System.out.println("YES");
			System.out.println(i+1);
		} else {
			System.out.println("NO");
		}
	}
	
	private static boolean check(Node p, Node predecessor, int color) {
		for(Node c : p.next) {
			if(c == predecessor) continue;
			
			if(c.color != color) {
				return false;
			}
			
			return check(c, p, color);
		}
		
		return true;
	}
}