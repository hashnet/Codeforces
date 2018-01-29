import java.io.File;
import java.util.Scanner;

public class Main {
	private static final int len = 4;
	
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new File("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int[] div = new int[len];
		div[0] = sc.nextInt();
		div[1] = sc.nextInt();
		div[2] = sc.nextInt();
		div[3] = sc.nextInt();
		
		int d = sc.nextInt();
		boolean[] check = new boolean[d+1];
		
		for(int i=1; i<=d ; i++) {
			for(int j=0 ; j<len ; j++) {
				if(i%div[j] == 0) check[i] = true;
			}
		}
		
		int count = 0;
		for(int i=1; i<=d ; i++) {
			if(check[i]) ++ count;
		}
		
		System.out.println(count);
	}
}
