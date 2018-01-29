import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int lastEven = 0;
		int lastOdd = 0;
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=1; i<=n; i++) {
			int k = sc.nextInt();
			if(k%2 == 0) {
				lastEven = i;
				++evenCount;
			} else {
				lastOdd = i;
				++oddCount;
			}
			
			if(evenCount > 1) {
				if(lastOdd != 0) {
					System.out.println(lastOdd);
					break;
				}
			}
			
			if(oddCount > 1) {
				if(lastEven != 0) {
					System.out.println(lastEven);
					break;
				}
			}
		}
	}
} 
