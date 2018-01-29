import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		boolean[] holes = new boolean[n+1];
		for(int i=0; i<m; i++) holes[sc.nextInt()] = true;
		
		int bone = 1;
		for(int i=1; i<=k; i++) {
			if(holes[bone] == true) break;
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == bone) bone = b;
			else if(b == bone) bone = a;
		}
		
		System.out.println(bone);
	}
}