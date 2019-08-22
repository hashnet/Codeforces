import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static class Pair {
		int val;
		int idx;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		List<Pair> boys = new ArrayList<>();
		for(int i=0; i<n; i++) {
			Pair boy = new Pair(); 
			boy.val = sc.nextInt();
			boy.idx = i + 1;
			
			boys.add(boy);
		}
		
		Collections.sort(boys, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				return Integer.compare(o1.val, o2.val);
			}
			
		});
		List<Pair> listA = new ArrayList<>();
		List<Pair> listB = new ArrayList<>();
		List<Pair> target = listB;
		
		int mid = n%2==0 ? -1 : n/2;
		for(int i=0; i<n; i++) {
			if(i == mid) {
				listB.add(boys.get(i));
			}
			
			else {
				target.add(boys.get(i));
				
				if(target == listA) target = listB;
				else target = listA;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		buildResult(sb, listA);
		buildResult(sb, listB);
		
		pr.print(sb.toString());
		
		pr.close();
		sc.close();
	}
	
	private static void buildResult(StringBuilder sb, List<Pair> list) {
		sb.append(list.size() + "\n");
		for(int i=0; i<list.size(); i++) {
			sb.append(list.get(i).idx + " ");
		}
		sb.append("\n");
	}
}
