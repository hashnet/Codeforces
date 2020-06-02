import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n-- > 0) {
			int count = sc.nextInt();
			int oCount = 0;
			int eCount = 0;
			
			Set<Integer> odd = new HashSet<>();
			Set<Integer> even = new HashSet<>();
			
			for(int i=0; i<count; i++) {
				int num = sc.nextInt();
				if(num%2 == 0) {
					eCount++;
					even.add(num);
				} else {
					oCount++;
					odd.add(num);
				}
			}
			
			if(oCount % 2 == 0)  {
				System.out.println("YES");
			} else {
				System.out.println(hasConsecutive(odd, even) ? "YES" : "NO");
			}
		}
		
		sc.close();
	}
	
	private static boolean hasConsecutive(Set<Integer> a, Set<Integer> b) {
		if(a.size() > b.size()) {
			Set<Integer> temp = a;
			a = b;
			b = temp;
		}
		
		for(Integer num : a) {
			if(b.contains(num-1) || b.contains(num+1)) return true;
		}
		
		return false;
	}
}
