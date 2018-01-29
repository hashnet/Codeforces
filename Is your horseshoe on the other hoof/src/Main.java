import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = 4;
		List<Integer> shoes = new ArrayList<Integer>();
		for(int i=1; i<=n; i++) {
			shoes.add(sc.nextInt());
		}
		
		shoes.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
		int count = 0;
		for(int i=1; i<n; i++) {
			if(shoes.get(i).intValue() == shoes.get(i-1).intValue()) ++count;
		}
		
		System.out.println(count);
	}
}
