import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		LinkedList<Integer> al = new LinkedList<Integer>();
		LinkedList<Integer> bl = new LinkedList<Integer>();
		for(int i=1; i<n; i++) {
			al.add(a[i]-a[i-1]);
		}
		al.add(l-a[n-1]+a[0]);
		
		for(int i=1; i<n; i++) {
			bl.add(b[i]-b[i-1]);
		}
		bl.add(l-b[n-1]+b[0]);
		
		boolean same = false;
		for(int i=1; i<=n; i++) {
			if(al.equals(bl)) {
				same = true;
				break;
			}
			
			int head = bl.removeFirst();
			bl.addLast(head);
		}
		
		System.out.println(same ? "YES" : "NO");
	}
}