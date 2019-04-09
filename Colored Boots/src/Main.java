import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	private class Pair<T> {
		T x;
		T y;
		
		public Pair(T x, T y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String ls = sc.next();
		String rs = sc.next();
		
		Map<Character, Set<Integer>> lm = new HashMap<>();
		Map<Character, Set<Integer>> rm = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			char c = ls.charAt(i);
			if(lm.containsKey(c)) {
				lm.get(c).add(i+1);
			} else {
				Set<Integer> set = new HashSet<>();
				set.add(i+1);
				lm.put(c, set);
			}
			
			c = rs.charAt(i);
			if(rm.containsKey(c)) {
				rm.get(c).add(i+1);
			} else {
				Set<Integer> set = new HashSet<>();
				set.add(i+1);
				rm.put(c, set);
			}
		}
		
		List<Pair<Integer>> pairs = new ArrayList<>();
		
		for(char c : lm.keySet()) {
			if( rm.keySet().contains(c)) {
				Set<Integer> lSet = lm.get(c);
				Set<Integer> rSet = rm.get(c);
				
				int elem = Math.min(lSet.size(), rSet.size());
				
				for(int i=0; i<elem; i++) {
					lSet.
				}
			}
		}
	}
	
}
