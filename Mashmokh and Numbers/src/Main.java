import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		List<Integer> result = new ArrayList<>();
		if(n == 1) {
			if(k == 0) result.add(1);
			else result.add(-1);
		} else if(k < n/2) {
			result.add(-1);
		} else {
			int p = n/2;
			
			int num = 0;
			for(int i=1; i<p; i++) {
				result.add(++num);
				result.add(++num);
			}
			
			int tgt = k - p + 1;
			int mult = (num/tgt + 1);
			result.add(mult * tgt);
			result.add((mult + 1) * tgt);
			
			if(n%2 != 0) {
				result.add(result.get(result.size()-1) + 1);
			}
		}
		
		for(int i=0; i<result.size(); i++) {
			writer.print(result.get(i) + " ");
		}
		writer.println();
		
		sc.close();
		writer.close();
	}
}
