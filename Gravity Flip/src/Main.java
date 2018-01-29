import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> cubes = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			cubes.add(sc.nextInt());
		}
		
		Collections.sort(cubes);
		
		for(int i=0; i<n; i++) {
			System.out.print(cubes.get(i) + " ");
		}
	}
}
