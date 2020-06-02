import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		while(N-- > 0) {
			int len = sc.nextInt();
			int[] nums = new int[len];
			
			for(int i=0; i<len; i++) {
				nums[i] = sc.nextInt();
			}
			Arrays.sort(nums);
			
			int minDiff = Integer.MAX_VALUE;
			for(int i=len-2; i>=0; i--) {
				minDiff = Math.min(minDiff, nums[i+1] - nums[i]);
				
				if(minDiff == 0) break;
			}
			
			System.out.println(minDiff);
		}
	}
}
