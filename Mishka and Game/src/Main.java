import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int countM = 0;
		int countC = 0;
		
		for(int i=1; i<=n; i++) {
			int m = sc.nextInt();
			int c = sc.nextInt();
			
			if(m > c) ++countM;
			else if(c > m) ++countC;
		}
		
		if(countM == countC) {
			System.out.println("Friendship is magic!^^");
		} else if(countM > countC) {
			System.out.println("Mishka");
		} else {
			System.out.println("Chris");
		}
	}
}
