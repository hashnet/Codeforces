import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] friends = new int[n+1];
		for(int i=1 ; i<=n ; i++) {
			friends[sc.nextInt()] = i;
		}
		
		for(int i=1 ; i<=n ; i++) {
			System.out.print(friends[i] + " ");
		}
	}
}
