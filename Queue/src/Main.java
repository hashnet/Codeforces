import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Long> queue = new ArrayList<Long>();
		for(int i=1; i<=n; i++) {
			queue.add(sc.nextLong());
		}
		Collections.sort(queue);
		
		long wait = 0;
		int disap = 0;
		for(int i=0; i<n; i++) {
			if(wait > queue.get(i)) {
				++disap;
			} else {			
				wait+=queue.get(i);
			}
		}
		
		System.out.println(n - disap);
	}
}
