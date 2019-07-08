import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int count0 = 0;
		int count1 = 0;
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == '0') ++count0;
			else if(str.charAt(i) == '1') ++count1;
		}
		
		if(count0 != count1) {
			System.out.println(1);
			System.out.println(str);
		} else {
			System.out.println(2);
			System.out.print(str.substring(0, 1));
			System.out.print(" ");
			System.out.println(str.substring(1));
		}
	}
}
