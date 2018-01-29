import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int m = sc.nextInt()-1;
		
		int d = sc.nextInt();
		int consumed = 7-d+1;
		
		int remaining = days[m] - consumed;
		
		int col = (remaining + 7 - 1) / 7;
		++col;
		
		System.out.println(col);
	}
}
