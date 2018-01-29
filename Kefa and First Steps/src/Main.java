import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		//Scanner sc = new Scanner(new File("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int prev = 0;
		int count = 0;
		int max = 0;
		while(--n >= 0) {
			int profit = sc.nextInt();
			if(profit >= prev) ++count;
			else count = 1;
			
			if(count > max) max = count;
			prev = profit;
		}
		
		System.out.println(max);
	}
}
