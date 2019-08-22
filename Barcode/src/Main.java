import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.nextLine();
		int[] costW = new int[m];
		int[] costB = new int[m];
		for(int i=0; i<n; i++) {
			String line = sc.nextLine();
			for(int j=0; j<line.length(); j++) {
				if(line.charAt(j) == '#') ++costW[j];
				else ++costB[j];
			}
		}
		
		
		/*int m = 6;
		int x = 2;
		int y = 3;
		int[] costW = {2, 10, 1, 3, 4, 8, 1};
		int[] costB = {1, 2, 5, 6, 5, 1, 1};
*/		
		int[] sumW = new int[m];
		int[] sumB = new int[m];
		sumW[0] = costW[0];
		sumB[0] = costB[0];
		
		for(int i=1; i<m; i++) {
			sumW[i] = sumW[i-1] + costW[i];
			sumB[i] = sumB[i-1] + costB[i];
		}
		
		for(int i=x; i<m; i++) {
			findNewSum(costW, sumW, sumB, i, x, y);
			findNewSum(costB, sumB, sumW, i, x, y);
		}
		
		pr.println(Arrays.toString(costW));
		pr.println(Arrays.toString(costB));
		pr.println(Arrays.toString(sumW));
		pr.println(Arrays.toString(sumB));
		
		pr.println(Math.min(sumB[m-1], sumW[m-1]));
		
		pr.close();
		sc.close();
	}
	
	private static void findNewSum(int[] thisArr, int[] thisSumArr, int[] thatSumArr, int idx, int min, int max) {
		int sum = 0;
		int pos = idx;
		
		for(int i=1; i<=min; i++) {
			sum += thisArr[pos];
			--pos;
		}
		
		int finalSum = sum + thatSumArr[pos];
		
		int tempSum = 0;
		for(int i=1; i<=(max-min); i++) {
			if(pos < 0) break;
			
			sum += thisArr[pos--];
			
			if(pos < 0) tempSum = sum;
			else tempSum = sum + thatSumArr[pos];
			
			if(tempSum < finalSum) finalSum = tempSum;
		}
		
		thisSumArr[idx] = finalSum;
	}
}
