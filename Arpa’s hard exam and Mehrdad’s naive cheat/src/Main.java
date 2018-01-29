import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] m = {8, 4, 2, 6};
		
		if(n == 0) System.out.println(1);
		else {
			System.out.println(m[(n-1)%4]);;
		}
	}
}
