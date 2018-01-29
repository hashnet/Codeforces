import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String x = br.readLine();
		String y = br.readLine();
		
		boolean found = true;
		for(int i=0; i<x.length(); i++) {
			if(y.charAt(i) > x.charAt(i)) {
				found = false;
				break;
			}
		}
		
		System.out.println(found ? y : "-1");
	}
}