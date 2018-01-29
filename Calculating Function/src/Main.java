import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long input = Long.parseLong(br.readLine());
		
		if(input%2 == 0) {
			System.out.println(input/2);
		} else {
			System.out.println((input/2) - input);
		}
	}
}