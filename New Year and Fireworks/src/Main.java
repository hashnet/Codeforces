import java.util.*;

public class Main {
	private static final int MAX = 301;
	private static boolean[][] sky = new boolean[MAX][MAX];
	private static int[] q;
	private static int n;
	private static final int dirX[] = {1, 1, 0, -1, -1, -1, 0, 1};
	private static final int dirY[] = {0, 1, 1, 1, 0, -1, -1, -1};
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		q = new int[n];
		for(int i=0; i<n; i++) q[i] = sc.nextInt();
		
		mark(0, 2, MAX/2, MAX/2);
	
		int count = 0;
		for(int i=0; i<MAX; i++){
			for(int j=0; j<MAX; j++) {
				if(sky[i][j] == true) ++count;
			}
		}
		
		System.out.println(count);
	}
	
	private static void mark(int i, int dir, int x, int y) {
		if(i>=n) return;
			
		int mag = q[i];
		int dx = dirX[dir];
		int dy = dirY[dir];
		while(--mag >= 0) {
			x += dx;
			y += dy;
			
			sky[x][y] = true;
		}
		
		mark(i+1, (dir+1)%8, x, y);
		mark(i+1, (dir+7)%8, x, y);
	}
}
