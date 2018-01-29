import java.io.*;

public class Main {
	private static final int MAX = 1000;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long count = 0;
		while(--n >= 0) {
			String str = br.readLine();
			if(str.equals("Tetrahedron")) count += 4;
			else if(str.equals("Cube")) count += 6;
			else if(str.equals("Octahedron")) count += 8;
			else if(str.equals("Dodecahedron")) count += 12;
			else if(str.equals("Icosahedron")) count += 20;
		}
		
		System.out.println(count);
	}
}
		