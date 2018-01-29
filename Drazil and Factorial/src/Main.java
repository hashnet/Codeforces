import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		List<Integer>[] facts = new ArrayList[10];
		
		facts[2] = new ArrayList<Integer>();
		facts[2].add(2);
		
		facts[3] = new ArrayList<Integer>();
		facts[3].add(3);
		
		facts[4] = new ArrayList<Integer>();
		facts[4].add(3);
		facts[4].add(2);
		facts[4].add(2);
		
		facts[5] = new ArrayList<Integer>();
		facts[5].add(5);
		
		facts[6] = new ArrayList<Integer>();
		facts[6].add(5);
		facts[6].add(3);
		
		facts[7] = new ArrayList<Integer>();
		facts[7].add(7);
		
		facts[8] = new ArrayList<Integer>();
		facts[8].add(7);
		facts[8].add(2);
		facts[8].add(2);
		facts[8].add(2);
		
		facts[9] = new ArrayList<Integer>();
		facts[9].add(7);
		facts[9].add(3);
		facts[9].add(3);
		facts[9].add(2);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		List<Integer> all = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(String.valueOf(s.charAt(i)));
			
			if(a==0 || a==1) continue;
			
			for(int j=0; j<facts[a].size(); j++) {
				all.add(facts[a].get(j));
			}
		}
		
		all.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return -Integer.compare(a, b);
			}});
		
		for(int i=0; i<all.size(); i++) {
			System.out.print(all.get(i));
		}
		System.out.println();
	}
}
