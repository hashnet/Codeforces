import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s = Integer.parseInt(br.readLine());
		double nD = Math.log(((double)s+5)/5) / Math.log(2);
		int n = (int)Math.ceil(nD);
		
		int step = 5 * (int)(Math.pow(2, (double)(n-1))  - 1);
		int place = s - step;
		
		int div = (int)Math.pow(2, (double)(n - 1)); 
		int item = ((place -1) / div);
		
		System.out.println(names[item]);
	}
}
