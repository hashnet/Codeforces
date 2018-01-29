import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Long> flowers = new ArrayList<Long>();
		while(--n >= 0) {
			flowers.add(sc.nextLong());
		}
		
		Collections.sort(flowers);
		
		long min = flowers.get(0);
		long max = flowers.get(flowers.size()-1);
		
		long count = 0;
		if(min == max) {
			long a = flowers.size();
			if(a%2 == 0) {
				count = a/2;
				count = count * (a-1);
			} else {
				count = (a-1)/2;
				count = count * a;
			}
		} else {
			long minCount = 0;
			for(int i=0; i<flowers.size(); i++) {
				if(flowers.get(i) == min) ++minCount;
				else break;
			}
			long maxCount = 0;
			for(int i=flowers.size()-1; i>=0; i--) {
				if(flowers.get(i) == max) ++maxCount;
				else break;
			}
			
			count = minCount * maxCount;
		}
		
		System.out.println((max - min) + " " + count);
	}
}
