import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int max = 0;
		int current = 0;
		while(--n >= 0){
			String[] values = br.readLine().split("\\s+");
			
			int exit = Integer.parseInt(values[0]);
			int entry = Integer.parseInt(values[1]);
			
			current = current - exit + entry;
			if(current > max) max = current;
		}
		
		System.out.println(max);
	}
}