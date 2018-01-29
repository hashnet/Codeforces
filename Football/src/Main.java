import java.io.*;

public class Main {
	private enum PlayerState {
		None,
		Zero,
		One
	}
	
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
	
		PlayerState state = PlayerState.None;
		int countOne = 0;
		int countZero = 0;
		boolean danger = false;
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) == '1'){
				if(state == PlayerState.One) {
					++countOne;
				} else {
					countOne = 1;
					state=PlayerState.One;
				}
				
				if(countOne >= 7) {
					danger = true;
					break;
				}
			} else if(str.charAt(i) == '0'){
				if(state == PlayerState.Zero) {
					++countZero;
				} else {
					countZero = 1;
					state = PlayerState.Zero;
				}
				
				if(countZero >= 7) {
					danger = true;
					break;
				}
			}
		}
		
		if(danger) System.out.println("YES");
		else System.out.println("NO");
	}
}