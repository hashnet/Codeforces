import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static class Pair {
		int start;
		int stop;
		
		@Override
		public String toString() {
			return start + "<->" + stop;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = in.nextInt();
		
		List<Pair> sections = new ArrayList<>();
		
		int possibleStart = 0;
		Pair section = new Pair();
		section.start = 0;
		boolean upDir = true;
		for(int i=1; i<n; i++) {
			if(arr[i] > arr[i-1]) {
				if(!upDir) {
					section.stop = i-1;
					sections.add(section);
					section = new Pair();
					section.start = possibleStart;
					
					upDir = true;
				}
			} else if(arr[i] < arr[i-1]) {
				possibleStart = i;
				upDir = false;
			}
		}
		section.stop = n-1;
		sections.add(section);
		
		//System.out.println(sections);
		
		int[] range = new int[n];
		int last = n;
		for(int i=sections.size()-1; i>=0; i--) {
			section = sections.get(i);
			for(int j=section.start; j<=Math.min(last-1, section.stop); j++) {
				range[j] = section.stop;
			}
			last = section.start;
		}
		
		//System.out.println(Arrays.toString(range));
		
		for(int i=0; i<m; i++) {
			int start = in.nextInt() - 1;
			int stop = in.nextInt() - 1;
			
			if (stop <= range[start]) out.println("Yes");
			else out.println("No");
		}
		
		in.close();
		out.close();
	}
}
