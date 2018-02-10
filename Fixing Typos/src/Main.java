import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		str = str.concat("_");
		
		char ch = str.charAt(0);
		int count = 1;
		boolean repeated = false;
		StringBuilder output = new StringBuilder();
		
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) != ch) {
				//print accordingly
				if(count == 1) {
					output.append(ch);
					
					repeated = false;
				} else {
					if(repeated == false) {
						output.append(ch);
						output.append(ch);
						
						repeated = true;
					} else {
						output.append(ch);
						
						repeated = false;
					}
				}
				
				count = 1;
				ch = str.charAt(i);
			} else {
				++count;
			}
		}
		
		System.out.println(output);
	}
}
