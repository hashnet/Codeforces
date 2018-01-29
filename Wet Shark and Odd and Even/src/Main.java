import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Long> odd = new ArrayList<Long>();
		long sum = 0;
		for(int i=1; i<=n; i++) {
			long k = sc.nextLong();
			if((k&1) == 0) {
				sum += k;
			} else {
				odd.add(k);
			}
		}
		
		Collections.sort(odd);
		int start;
		if((odd.size()&1) == 0) start = 0;
		else start = 1;
		
		for(int i=start; i<odd.size(); i++) {
			sum += odd.get(i);
		}
		
		System.out.println(sum);
	}
}
