import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		
		int h = sc.nextInt();
		int l  = sc.nextInt();
		
		double dh = (double) h;
		double dl = (double) l;
			
		double x = ((dl * dl) - (dh * dh)) / (2 * dh);
		
		pr.println(x);
		
		pr.close();
		sc.close();
	}
}
