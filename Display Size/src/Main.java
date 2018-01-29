import java.util.*;
	
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int r = (int) Math.sqrt(n);
		
		for(int i=r; i>=1; i--) {
			if(n%i == 0) {
				System.out.println(i + " " + n/i);
				break;
			}
		}
	}
}
