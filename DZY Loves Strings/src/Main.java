import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new File("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
	
		int s = input.length();
		int k = sc.nextInt();
		
		int[] charVal = new int[26];
		int max = 0;
		for(int i=0 ; i<26 ; i++) {
			charVal[i] = sc.nextInt();
			if(charVal[i] > max) max = charVal[i];
		}
		
		int sum1 = 0;
		for(int i=0 ; i<s ; i++) {
			sum1+=(i+1) * charVal[input.charAt(i)-'a'];
		}
		
		int sum2 = max * ((s*k) + (k * (k+1))/2);
	
		int sum = sum1 + sum2;
		System.out.println(sum);
	}
}
