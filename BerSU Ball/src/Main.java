import java.util.*;

public class Main {
	private static class StoB implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return Integer.compare(o1.intValue(), o2.intValue());
		}		
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue<Integer> qA = new PriorityQueue<Integer>(new StoB());		
		PriorityQueue<Integer> qB = new PriorityQueue<Integer>(new StoB());
		
		int n = sc.nextInt();
		while(--n >= 0) qA.add(sc.nextInt());
		
		int m = sc.nextInt();
		while(--m >= 0) qB.add(sc.nextInt());
		
		int count = 0;
		while(!qA.isEmpty() && !qB.isEmpty()) {
			if(Math.abs(qA.peek().intValue() - qB.peek().intValue()) <= 1) {
				++count;
				qA.remove();
				qB.remove();
			} else if(qA.peek().intValue() < qB.peek().intValue()) {
				qA.remove();
			} else if(qA.peek().intValue() > qB.peek().intValue()) {
				qB.remove();
			}			
		}
		
		System.out.println(count);		
	}
}
