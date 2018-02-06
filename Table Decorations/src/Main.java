import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long[] colors = new long[3];
		colors[0] = sc.nextLong();
		colors[1] = sc.nextLong();
		colors[2] = sc.nextLong();
		
		Arrays.sort(colors);
		if(colors[2] >= 2 * (colors[0] + colors[1])) System.out.println(colors[0] + colors[1]);
		else System.out.println((colors[0] + colors[1] + colors[2])/3);
	}
}
