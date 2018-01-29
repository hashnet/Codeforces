import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] num = new int[n];
		
		int count1 = 0;
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
			if(num[i] == 1) ++ count1;
		}
		
		int max = 0;
		for(int i=0; i<n; i++) {
			int count = count1;
			for(int j=i; j<n; j++) {
				if(num[j] == 0) ++count;
				else if(num[j] == 1) --count;
				
				if(count > max) max = count;
			}
		}		
		
		System.out.println(max);
	}
}
