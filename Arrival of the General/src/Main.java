import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new File("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num = sc.nextInt();
		int maxVal = num;
		int minVal = num;
		int maxPos = 1;
		int minPos = 1;
		
		for(int i=2; i<=n; i++) {
			num = sc.nextInt();
			
			if(num <= minVal) {
				minVal = num;
				minPos = i;
			}
			
			if(num > maxVal) {
				maxVal = num;
				maxPos = i;
			}			
		}
		
		
		int count = 0;
		count+=(maxPos - 1);
		count+=(n-minPos);
		if(maxPos > minPos) --count;
		
		System.out.println(count);
	}
}
