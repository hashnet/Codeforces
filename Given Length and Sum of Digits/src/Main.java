import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int sum = sc.nextInt();
		
		int min, max;
		
		if(len == 1) min = 0;
		else min = 1;
		
		max = len * 9;
		
		if(sum < min || sum > max) {
			System.out.println("-1 -1");
			return;
		}
		
		int[] minArr = new int[len];
		int[] maxArr = new int[len];
		
		//Calculate min
		minArr[0] = min;
		for(int i=1; i<minArr.length; i++) {
			minArr[i] = 0;
		}
		
		int remaining = sum - min;
		int pos = len-1;
		while(remaining > 0) {
			int toAdd = Math.min(9, remaining);
			minArr[pos] += toAdd;
			remaining -= toAdd;
			
			--pos;
		}
		
		//Calculate max
		for(int i=0; i<maxArr.length; i++) {
			maxArr[i] = 9;
		}
		
		remaining = max - sum;
		pos = len-1;
		while(remaining > 0) {
			int toSub = Math.min(9, remaining);
			maxArr[pos] -= toSub;
			remaining -= toSub;
			
			--pos;
		}
		
		print(minArr);
		System.out.print(" ");
		print(maxArr);
		System.out.println();
	}
	
	private static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
