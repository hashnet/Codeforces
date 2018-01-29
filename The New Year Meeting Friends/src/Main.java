import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> points = new ArrayList<Integer>();
		points.add(sc.nextInt());
		points.add(sc.nextInt());
		points.add(sc.nextInt());
		
		Collections.sort(points);
		
		int dist = points.get(2) - points.get(0);
		
		System.out.println(dist);
	}
}
