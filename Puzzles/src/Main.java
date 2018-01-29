import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new File("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<Integer> puzzles = new ArrayList<Integer>();
		while(--m >= 0) puzzles.add(sc.nextInt());
		
		Collections.sort(puzzles);
		int min = puzzles.get(puzzles.size()-1);
		for(int i=0; i<=puzzles.size()-n; i++) {
			int newMin = puzzles.get(i+n-1) - puzzles.get(i);
			
			if (newMin < min) min = newMin;
		}
		
		System.out.println(min);
	}
}
