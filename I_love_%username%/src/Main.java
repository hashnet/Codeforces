import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int score = sc.nextInt();
		int maxScore = score;
		int minScore = score;
		
		int total = 0;
		for(int i=2; i<=n; i++) {
			score = sc.nextInt();
			if(score > maxScore) {
				++total;
				maxScore = score;
			} else if(score < minScore) {
				++total;
				minScore = score;
			}
		}

		System.out.println(total);
	}
}
