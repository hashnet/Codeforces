import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Map<Long, Long> table = new TreeMap<>();
		
		int n = sc.nextInt();
		
		while(n-- > 0) {
			long x = sc.nextLong();
			
			table.merge (x, x, (vOld, vNew) -> vOld + vNew);
		}
		
		long prevId = 0;
		long prevWith = 0;
		long prevWithout = 0;
		
		long newWith;
		long newWithout;
		for(long s : table.keySet()) {
			newWith = s == (prevId + 1) ? prevWithout + table.get(s) : Math.max(prevWith, prevWithout) + table.get(s);
			newWithout = Math.max(prevWith, prevWithout);
			
			prevId = s;
			prevWith = newWith;
			prevWithout = newWithout;
		}
		
		System.out.println(Math.max(prevWith, prevWithout));
	}
}
