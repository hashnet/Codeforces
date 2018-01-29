import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n >=0) {
			System.out.println(n);
			return;
		}
		
		int n1 = n / 10;
		int n2 = ((n/100) * 10) + (n%10);
		
		System.out.println(n1 >= n2 ? n1 : n2);
	}
}
