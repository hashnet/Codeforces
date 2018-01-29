import java.util.*;

public class Main {
	private static final int MAX = 20000;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String south = new String("South");
		String north = new String("North");
		String west = new String("West");
		String east = new String("East");
		/*
		int [] pa = new int[3*MAX+1];
		for(int i=0; i<=MAX; i++) {
			pa[i] = i;
		}
		for(int i=MAX+1; i<=2*MAX; i++) {
			pa[i] = (2*MAX)-i;
		}
		for(int i=(2*MAX)+1; i<=3*MAX; i++) {
			pa[i] = i - (2*MAX);
		}
		*/
		int n = sc.nextInt();
		
		int pos = 0;
		while(--n >= 0) {
			int d = sc.nextInt();
			String str = sc.next();
			
			if(pos==0 && !str.equals(south)) {
				System.out.println("NO");
				return;
			} else if(pos==MAX && !str.equals(north)) {
				System.out.println("NO");
				return;
			}
			/*
			d = d%(2*MAX);
			
			if(str.equals(south)) {
				pos = pa[pos+d];
			} else if(str.equals(north)) {
				pos += 2*MAX;
				pos = pa[pos-d];
			}
			*/
			
			if(str.equals(south)) {
				if((pos + d) > MAX) {
					System.out.println("NO");
					return;
				} else {
					pos += d;
				}
			} else if(str.equals(north)) {
				if((pos - d) < 0) {
					System.out.println("NO");
					return;
				} else {
					pos -= d;
				}
			}
		}
		
		System.out.println(pos == 0 ? "YES" : "NO");
	}
}
