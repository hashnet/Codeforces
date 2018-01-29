import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashMap<Integer, List<Integer>> indices = new HashMap<Integer, List<Integer>>();
		
		indices.put(1, new ArrayList<Integer>());
		indices.put(2, new ArrayList<Integer>());
		indices.put(3, new ArrayList<Integer>());
		
		for(int i=1; i<=n; i++) {
			int key = sc.nextInt();
			
			indices.get(key).add(i);
		}
		
		
		int min = indices.get(1).size();
		for( List<Integer> value : indices.values()) {
			if(value.size() < min) min = value.size();
		}
		
		System.out.println(min);
		if(min > 0) {
			for(int i=0; i<min; i++) {
				for(List<Integer> value : indices.values()) {
					System.out.print(value.get(i) + " ");
				}
				System.out.println();
			}
		}
	}
}
