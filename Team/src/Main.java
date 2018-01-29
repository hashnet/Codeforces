import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		while(--n >= 0) {
			String[] ijk = br.readLine().split("\\s+");
			int i = Integer.parseInt(ijk[0]);
			int j = Integer.parseInt(ijk[1]);
			int k = Integer.parseInt(ijk[2]);
			
			if((i+j+k) >= 2) ++count;
		}
		
		System.out.println(count);
	}
}
