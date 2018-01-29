import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		List<Integer> members = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			members.add(sc.nextInt());
		}
		
		Collections.sort(members);
		
		int max = 5-k;
		
		int count = 0;
		for(int i=0; i<n; i++) {
			if(members.get(i).intValue() <= max) ++count;
		}
		

		System.out.println(count/3);
	}
}
