import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int curPos = 1;
		long totalTime = 0;
		for(int i=1; i<=m; i++) {
			int nextPos = sc.nextInt();
			
			if(nextPos > curPos) {
				totalTime += (long)(nextPos - curPos);
			}
			if(nextPos < curPos) {
				totalTime += (long)(n + nextPos - curPos);
			}
			
			curPos = nextPos;
		}
		
		System.out.println(totalTime);
	}
}
