import java.util.*;

public class Main {
	private static final int SIZE = (int) 10E+5 + 1;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int[] factors = new int[SIZE];
		
		int n = sc.nextInt();
		int maxRange = 0;
		while(--n >= 0) {
			int num = sc.nextInt();
			
			if(num == 1) {
				factors[1] = 1;
				if(maxRange < 1) maxRange = 1;
			}
			else {
				for(int i=2; i<=num/i; i++) {
					int factor = 0;
					while(num%i == 0) {
						factor = i;
						
						num /= i;
					}
					
					if(factor != 0) {
						++factors[factor];
						
						if(factor > maxRange) maxRange = factor;
					}
				}
				if(num > 1) {
					++factors[num];
					if(num > maxRange) maxRange = num;
				}
			}
		}
		
		int max = 0;
		for(int i = 1; i<=maxRange; i++) {
			if(factors[i] > max) max = factors[i];
		}
		
		System.out.println(max);
	}
}
