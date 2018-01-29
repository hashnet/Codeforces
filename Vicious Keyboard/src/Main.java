import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int count = 0;
		boolean[] stat = new boolean[input.length()];
		
		for(int i=0; i<input.length()-1; i++) {
			if(input.charAt(i) == 'V' && input.charAt(i+1) == 'K') {
				stat[i] = true;
				stat[i+1] = true;
				
				++count;
			}
		}
		
		for(int i=0; i<input.length()-1; i++) {
			if(stat[i] == false && stat[i+1] == false) {
				if(input.charAt(i) == 'V') {
					++count;
					break;
				} else if(input.charAt(i+1) == 'K') {
					++count;
					break;
				}
			}
		}
		
		System.out.println(count);
	}
}
