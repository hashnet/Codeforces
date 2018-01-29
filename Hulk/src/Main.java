import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
	
		String[] hulk = {"I love ", "I hate "};

		StringBuilder output = new StringBuilder("");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i!=1) output.append("that ");
			
			output.append(hulk[i%2]);
		}
		output.append("it");
		
		System.out.println(output);
	}
}
