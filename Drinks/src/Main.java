import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		double sum = 0;
		for(int i=1; i<=n; i++) {
			sum += sc.nextDouble();
		}

		System.out.println(sum/n);
	}
}
