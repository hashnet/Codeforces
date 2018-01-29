import java.util.*;
import java.io.*;

//Version 2

public class Main {
	private static class Worm {
		long start;
		long end;
		int index;
		
		public Worm(long start, long end, int index) {
			this.start = start;
			this.end = end;
			this.index = index;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Worm> worms = new ArrayList<Worm>();
		
		int n = Integer.parseInt(br.readLine());
		String[] nInputs = br.readLine().split("\\s+");
		long next = 1;
		for(int i=0; i<n; i++) {
			long c = Long.parseLong(nInputs[i]);
			
			worms.add(new Main.Worm(next, next+c-1, i+1));
			next = next+c;
		}
		
		/*
		Collections.sort(worms, new Comparator<Worm>(){
			@Override
			public int compare(Worm arg0, Worm arg1) {
				return Long.compare(arg0.index, arg1.index);
			}});
		*/
	
		int k = Integer.parseInt(br.readLine());
		String[] kInputs = br.readLine().split("\\s+");
		for(int i=0; i<k; i++) {
			System.out.println(searchWorms(worms, Long.parseLong(kInputs[i])));
		}
	}
	
	private static int searchWorms(List<Worm> sortedWorms, long key) {
		int left = 0; 
		int right = sortedWorms.size()-1;
		
		while(left <= right) {
			int mid = (left+right)>>>1;
		
			if(key >= sortedWorms.get(mid).start && key <= sortedWorms.get(mid).end) {
				return sortedWorms.get(mid).index;
			} else if(key < sortedWorms.get(mid).start) {
				right = mid-1;
			} else if(key > sortedWorms.get(mid).end) {
				left = mid+1;
			}
		}
		
		return -1;
	}
}
