import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int x3, y3, x4, y4 = 0;
		if(x1 == x2) {
			int diff = Math.abs(y2 - y1);
			x3 = x1 + diff;
			y3 = y1;
			x4 = x2 + diff;
			y4 = y2;
		} else if(y1 == y2) {
			int diff = Math.abs(x2 - x1);
			x3 = x1;
			y3 = y1 + diff;
			x4 = x2;
			y4 = y2 + diff;
		} else {
			int diffX = Math.abs(x2 - x1);
			int diffY = Math.abs(y2 - y1);
			
			if(diffX != diffY) {
				System.out.println("-1");
				return;
			}
			
			x3 = x1;
			y3 = y2;
			x4 = x2;
			y4 = y1;
		}
		
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}
