import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int p = 0;
		int c = 0;
		for(int i=1; i<=n; i++) {
			int s = sc.nextInt();
			
			if(s == -1) {
				if(p > 0) --p;
				else ++c;
			} else {
				p+=s;
			}	
		}
		
		System.out.println(c);
	}
}
