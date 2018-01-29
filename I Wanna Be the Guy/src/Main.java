import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		boolean[] games = new boolean[n+1];
		int played = n;
		
		for(int j=1; j<=2; j++) {
			int numOfPos = sc.nextInt();
			for(int i=1; i<=numOfPos; i++) {
				int pos = sc.nextInt();
				
				if(games[pos] == false) {
					--played;
					games[pos] = true;
				}
				
			}
		}
		
		if(played <= 0) System.out.println("I become the guy.");
		else System.out.println("Oh, my keyboard!");
	}
}
