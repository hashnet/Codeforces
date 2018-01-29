import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();
		
		if(d1 > d2) {
			int t = d1;
			d1 = d2;
			d2 = t;
		}
		
		int cost = 0;
		
		cost+= d1;
		cost+= d3 < (d1 + d2) ? d3 : (d1 + d2);
		cost+= d2 < (d1 + d3) ? d2 : (d1 + d3);
		
		System.out.println(cost);
	}
}
