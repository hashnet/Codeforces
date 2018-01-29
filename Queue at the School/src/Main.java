import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] values = br.readLine().split("\\s+");
		int n = Integer.parseInt(values[0]);
		int t = Integer.parseInt(values[1]);
		String input = br.readLine();
		char[]queue = input.toCharArray();
		for(int i=1 ; i<=t ; i++) {
			char[] temp = new char[input.length()];
			System.arraycopy(queue, 0, temp, 0, input.length());
			boolean modified = false;
			for(int j=1 ; j<input.length() ; j++) {
				if(queue[j]=='G' && queue[j-1]=='B') {
					temp[j] = 'B';
					temp[j-1] = 'G';
					modified = true;
				}
			}
			if(!modified) break;
			
			System.arraycopy(temp, 0, queue, 0, input.length());
		}
		
		System.out.println(queue);
	}
}