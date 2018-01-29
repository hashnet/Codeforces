import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max, min;
		char maxColor, minColor;
		if(a >= b) {
			max = a;
			min = b;
			maxColor = 'G';
			minColor = 'B';
		} else {
			max = b;
			min = a;
			maxColor = 'B';
			minColor = 'G';
		}
		
		int maxBucket = (max-1)/k + 1;
		if(min < (maxBucket - 1)) {
			System.out.println("NO");
			return;
		}
		
		int divMax = max / maxBucket;
		int remMax = max - (divMax * maxBucket);
		
		int divMin = min / maxBucket;
		int remMin = min - (divMin * maxBucket);
		
		StringBuilder output = new StringBuilder();
		
		int countMax, countMin;
		for(int i=1; i<=maxBucket; i++) {
			if(i <= remMax) {
				countMax = divMax + 1;
			} else {
				countMax = divMax;
			}
			for(int j = 1; j <= countMax; j++) {
				output.append(maxColor);
			}
			
			if(i <= remMin) {
				countMin = divMin + 1;
			} else {
				countMin = divMin;
			}
			for(int j = 1; j <= countMin; j++) {
				output.append(minColor);
			}
		}
		
		System.out.println(output);
	}
}
