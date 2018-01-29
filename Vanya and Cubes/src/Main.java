import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sumLevel = 0;
		int level = 0;
		int sum = 0;
		do{
			++level;
			sumLevel += level;
			sum += sumLevel;
		} while(sum <= n);
		
		System.out.println(--level);
	}
}
