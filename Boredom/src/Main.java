import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashMap<Long, Long> sequence = new HashMap<Long, Long>();
		
		for(int i=1; i<=n; i++) {
			long a = sc.nextInt();
			
			if(sequence.containsKey(a)) {
				sequence.put(a, sequence.get(a) + a);
			} else {
				sequence.put(a, a);
			}
		}
		
		List<Long> keys = new ArrayList<Long>(sequence.keySet());
		Collections.sort(keys);
		
		long[] result = new long[keys.size()];
		result[0] = sequence.get(keys.get(0));
		for(int i=1; i<keys.size(); i++) {
			if(keys.get(i) == keys.get(i-1) + 1 ) {
				long prevVal = result[i-1];
				long newVal = 0;
				if(i>1) newVal = result[i-2] + sequence.get(keys.get(i));
				else newVal = sequence.get(keys.get(i));
				
				result[i] = max(prevVal, newVal);
			} else {
				result[i] = result[i-1] + sequence.get(keys.get(i));
			}
		}
		
		System.out.println(result[keys.size()-1]);
	}
	
	private static long max(long a, long b) {
		if(a >= b) return a;
		else return b;
	}
}
