import java.util.*;

public class Main {
	
	private static class MinMaxPriorityQueue<Node> {
		private static class Node {
			int val;
			public Node(int val) {
				this.val = val;
			}
		}
		private PriorityQueue<Node> maxQ = new PriorityQueue<Node>(new Comparator<Node>(){
			@Override
			public int compare(Node o1, Node o2) {
				return -Integer.compare(o1.val, o2.val);
			}			
		});
		private PriorityQueue<Node> minQ = new PriorityQueue<Node>(new Comparator<Node>(){
			@Override
			public int compare(Node o1, Node o2) {
				return Integer.compare(o1.val, o2.val);
			}			
		});
		
		public int size() {
			return maxQ.size();
		}
		
		public void add(Node e) {
			maxQ.add(e);
			minQ.add(e);
		}
		
		public int peekMax() {
			return maxQ.peek().val;
		}
		
		public int peekMin() {
			return minQ.peek().val;
		}
		
		public int removeMax() {
			Node e = maxQ.poll();
			minQ.remove(e);
			
			return e.val;
		}
		
		public int removeMin() {
			Node e = minQ.poll();
			maxQ.remove(e);
			
			return e.val;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		MinMaxPriorityQueue qSlices = new MinMaxPriorityQueue();
		
		List<Integer> lSlices = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			lSlices.add(sc.nextInt());
		}
		
		if(n > k) {
			lSlices.sort(new Comparator<Integer>(){
				@Override
				public int compare(Integer i1, Integer i2) {
					return -Integer.compare(i1, i2);
				}
			});
		}
		
		for(int i=0; i<n && i<k; i++) {
			qSlices.add(new MinMaxPriorityQueue.Node(lSlices.get(i)));
		}
				
		while(qSlices.peekMax() > 1 && qSlices.size() < k) {
			int x = qSlices.removeMax();
			qSlices.add(new MinMaxPriorityQueue.Node(x/2));
			
			x = (x/2) + (x&1);
			qSlices.add(new MinMaxPriorityQueue.Node(x));
			
		}
		
		if(qSlices.size() < k) {
			System.out.println("-1");
			return;
		}
		
		int x = qSlices.peekMax();
		int a = x/2;
		int b = a + (x&1);
		int y =  qSlices.peekMin();
		while(a > y || b > y) {
			qSlices.removeMax();
			
			if(b > y) {				
				if(qSlices.size() >= k) qSlices.removeMin();
				qSlices.add(new MinMaxPriorityQueue.Node(b));
			}
			y =  qSlices.peekMin();
			if(a > y) {
				if(qSlices.size() >= k) qSlices.removeMin();
				qSlices.add(new MinMaxPriorityQueue.Node(a));
			}
			
			x = qSlices.peekMax();
			a = x/2;
			b = a + (x&1);
			y =  qSlices.peekMin();
		}
		
		System.out.println(qSlices.peekMin());		
	}
}
