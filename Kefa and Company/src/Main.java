import java.util.*;

public class Main {
	private static class Friend {
		int money;
		int factor;
		
		public Friend(int money, int factor) {
			this.money = money;
			this.factor = factor;
			
		}
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		List<Friend> a = new ArrayList<Friend>();
		for(int i=0; i<n; i++) {
			a.add(new Friend(sc.nextInt(), sc.nextInt()));
		}
		
		System.out.println(twoPointer(a, d));
	}
	
	private static long twoPointer(List<Friend> a, int d) {
		a.sort(new Comparator<Friend>() {
			@Override
			public int compare(Friend f0, Friend f1) {
				return Integer.compare(f0.money, f1.money);
			}});
		
		long maxFactor=0, factor=0;;
		int l=0, r=0;
		
		while(l<a.size()) {
			while(r<a.size() && (a.get(r).money-a.get(l).money) < d) {
				factor += a.get(r).factor;
				maxFactor = Math.max(factor, maxFactor);

				++r;
			}
			factor -= a.get(l).factor;
			++l;
		}
		
		return maxFactor;
	}
}
