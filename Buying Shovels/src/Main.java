import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(new File("src/input.txt"));
		int N = sc.nextInt();
		while(N-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			double r = Math.sqrt(n);
			int start = (int)Math.ceil((double)n / k);
			
			boolean found = false;
			for(int i=start; i<r; i++) {
				if(n % i == 0) {
					System.out.println(i);
					found = true;
					break;
				}
			}
			
			if(!found) {
				start = Math.min((int)r, k);
				for(int i=start; i>=1; i--) {
					if(n % i == 0) {
						System.out.println(n / i);
						break;
					}
				}
			}
		}

		sc.close();
	}
}
