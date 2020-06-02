import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		while(N-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			String[] strings = new String[n];
			for(int i=0; i<n; i++) {
				strings[i] = sc.next();	
			}
			
			System.out.println(solution(strings, n, m));
		}

		sc.close();
	}
	
	private static String solution(String[] strings, int n, int m) {
		int[] dim = new int[n];
		for(int i=0; i<n; i++) {
			dim[i] = 1;
		}
		
		String result = DP(strings, n, m, dim, m-1);
		return result == null ? "-1" : result;
	}
	
	private static String DP(String[] strings, int n, int m, int[] dim, int idx) {
		char fixed = '*';
		boolean isFixed = false;
		for(int i=0; i<n; i++) {
			if(dim[i] == 0) {
				if(isFixed && strings[i].charAt(idx) != fixed) { 
					return null;
				} else {
					isFixed = true;
					fixed = strings[i].charAt(idx);
				}
			} else {
				
			}
		}
		return null;
	}
}
