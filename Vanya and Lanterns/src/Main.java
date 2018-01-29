import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		List<Integer> lights = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			lights.add(sc.nextInt());
		}
		Collections.sort(lights);
		
		int gap = 0;
		int tGap = 0;
		for(int i=1; i<lights.size(); i++) {
			tGap = lights.get(i) - lights.get(i-1);
			if(tGap > gap) gap = tGap;
		}
		
		tGap = lights.get(0) * 2;
		if(tGap > gap) gap = tGap;
		
		tGap = (l-lights.get(lights.size()-1)) * 2;
		if(tGap > gap) gap = tGap;
		
		System.out.println((double)gap/2);
	}
}
