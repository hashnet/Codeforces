import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		List<Integer> flower = new ArrayList<Integer>();
		for(int i=1; i<=12; i++) {
			flower.add(sc.nextInt());
		}
		
		flower.sort(new Comparator<Integer>(){

			@Override
			public int compare(Integer arg0, Integer arg1) {
				return -Integer.compare(arg0.intValue(), arg1.intValue());
			}});
		
		if(k==0) {
			System.out.println(0);
			return;
		}
		
		int growth = 0;		
		int i = 0;
		for(i=0; i<12; i++) {
			growth += flower.get(i);
			
			if(growth >= k) break;
		}
		
		System.out.println(i < 12 ? i + 1 : "-1");
	}
}
