import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		List<Integer> wealth = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++) wealth.add(sc.nextInt());
		
		Collections.sort(wealth);
		
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}		
		
		int iter = n-1;
		double avg1 = 0.0;
		int count = 0;
		while(count < n1) {
			double x = (double)wealth.get(iter);
			
			avg1 = avg1 + ((x - avg1) / (count +1));
			--iter;
			++count;
		}
		
		double avg2 = 0.0;
		count = 0;
		while(count < n2) {
			double x = (double)wealth.get(iter);
			
			avg2 = avg2 + ((x - avg2) / (count +1));
			--iter;
			++count;
		};
		
		System.out.println(avg1 + avg2);
	}
}
