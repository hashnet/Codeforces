import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int len = str.length();
		
		int[] sum = new int[len];
		boolean[] possible = new boolean[len];
		int[] last = new int[len];
		
		possible[len-1] = false;
		int count = 0;
		
		for(int i=len-2; i>=0; i++) {
			String sub = str.substring(i, i+2);
			if(sub.equals("()") || sub.equals("") || sub.equals("") || sub.equals("")) {
				
			}
		}
	}
}
