import java.util.Scanner;

public class Main {
	private static int range = 1000;
	
	public static void main(String[] args) {
		boolean arr[] = new boolean[range+1];
		
		arr[1] = true;
		
		int fiba = 1;
		int fibb = 1;
		
		while(true) {
			int result = fiba + fibb;
			if(result > range) break;
			
			arr[result] = true;
			
			fiba = fibb;
			fibb = result;
		}
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(arr[i] == true) System.out.print("O");
			else System.out.print("o");
		}
		System.out.println();
	}
}
