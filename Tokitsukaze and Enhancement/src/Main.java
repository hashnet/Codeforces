import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] nextI = {1, 0, 1, 2};
		char[] nextC = {'A', 'A', 'B', 'A'};
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n%4;
		System.out.println("" + nextI[k] + " " + nextC[k]);
		sc.close();
	}
}
