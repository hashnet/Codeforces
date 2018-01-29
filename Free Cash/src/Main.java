import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int lastH = -1;
		int lastM = -1;
		int max = 0;
		int count = 1;
		int h = -1;
		int m = -1;
		while(--n >= 0) {
			h = sc.nextInt();
			m = sc.nextInt();
			
			if(h==lastH && m==lastM) {
				++count;
			} else {
				if(count > max) max = count;
				count = 1;
				lastH = h;
				lastM = m;
			}
		}
		
		if(count > max) max = count;
		
		System.out.println(max);
	}
}
