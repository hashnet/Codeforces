import java.io.*;
import java.util.*;

public class Main {
	private static int steps(String str, int i) {
		int len = str.length();
		StringBuilder stair = new StringBuilder(str);
		
		int count = 0;
		while(i >=0 && i < len) {
			++count;
			if(stair.charAt(i) == 'U') {
				stair.setCharAt(i, 'D');
				++i;
			} else if(stair.charAt(i) == 'D') {
				stair.setCharAt(i, 'U');
				--i;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new File("src/input.txt"));
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		for(int i=0; i<n ; i++) {
			System.out.print(steps(str, i) + " ");
		}
	}
}
