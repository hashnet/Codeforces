import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int left, right;
		
		int n = sc.nextInt();
		int leftMaxN = 0;
		int rightMinN = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			left = sc.nextInt();
			right = sc.nextInt();
		
			if(left > leftMaxN) leftMaxN = left;
			if(right < rightMinN) rightMinN = right;
		}
		
		int m = sc.nextInt();
		int leftMaxM = 0;
		int rightMinM = Integer.MAX_VALUE;
		for(int i=0; i<m; i++) {
			left = sc.nextInt();
			right = sc.nextInt();
		
			if(left > leftMaxM) leftMaxM = left;
			if(right < rightMinM) rightMinM = right;
		}
		
		int max = 0;
		int temp = 0;
		
		if(rightMinN < leftMaxM) temp = leftMaxM - rightMinN;
		if(temp > max) max = temp;
		
		if(rightMinM < leftMaxN) temp = leftMaxN - rightMinM;
		if(temp > max) max = temp;
		
		System.out.println(max);
	}
}