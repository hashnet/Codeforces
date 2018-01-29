import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Deque<Integer> q = new LinkedList<Integer>();
		for(int i=0; i<n; i++) {
			q.add(sc.nextInt());
		}
		
		int s=0, d=0;
		boolean sTurn = true;
		while(!q.isEmpty()){
			int x = q.peekLast() > q.peekFirst() ? q.pollLast() : q.pollFirst();
			
			if(sTurn) s+= x;
			else d+= x;
			
			sTurn ^= true;
		}
		
		System.out.println(s + " " + d);
	}
}
