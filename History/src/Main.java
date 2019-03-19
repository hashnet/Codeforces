import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static class Pair<T1 extends Comparable<T1>, T2 extends Comparable<T2>> implements Comparable<Pair<T1, T2>>{
		private T1 val1;
		private T2 val2;
		
		public Pair(T1 val1, T2 val2) {
			this.val1 = val1;
			this.val2 = val2;
		}

		@Override
		public int compareTo(Pair<T1, T2> other) {
			return other.val2.compareTo(this.val2);
		}

		@Override
		public String toString() {
			return "{" + val1 + ", " + val2 + "}"; 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Pair<Long, Long>> list = new ArrayList<>();
		for(int i=1; i<=n; i++) {
			list.add(new Pair<Long, Long>(sc.nextLong(), sc.nextLong()));
		}
		
		Collections.sort(list);
		
		long min = Long.MAX_VALUE;
		
		long count = 0;
		for(Pair<Long, Long> pair : list) {
			if(pair.val1 > min) ++count;
			
			if(pair.val1 < min) min = pair.val1;
		}
		System.out.println(count);
		
		sc.close();
	}
}
