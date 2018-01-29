import java.io.*;

public class Main {
	private static final int[] lucky = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
	private static final int size = 14;
	
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		boolean divisible = false;
		for(int i=0 ; i<size ; i++) {
			if(n%lucky[i] == 0) {
				divisible = true;
				break;
			}
		}
		
		if(divisible) System.out.println("YES");
		else System.out.println("NO");
	}
}