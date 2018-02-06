import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min = Math.min(x, y);
		//int max = Math.max(x, y);
		
		System.out.println(min + 1);
		for(int i=0; i<=min; i++) {
			System.out.println(i + " " + (min-i));
		}
	}
}
