import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String[] str = sc.nextLine().split("\\s+");
			for(int j=0; j<m; j++) {
				if(str[j].charAt(0) == 'C' || str[j].charAt(0) == 'M' || str[j].charAt(0) == 'Y') {
					System.out.println("#Color");
					return;
				}			
			}
		}
		
		System.out.println("#Black&White");
	}
}
