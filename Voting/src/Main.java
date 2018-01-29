import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		Queue<Integer> qD = new LinkedList<Integer>();
		Queue<Integer> qR = new LinkedList<Integer>();
		
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == 'D') qD.add(i);
			else if(str.charAt(i) == 'R') qR.add(i);
		}
		
		while(!qD.isEmpty() && !qR.isEmpty()) {
			int tD = qD.remove();
			int tR = qR.remove();
			
			if(tD < tR) qD.add(tD + n);
			else qR.add(tR + n);
		}
		
		System.out.println(qD.isEmpty() ? "R" : "D");
	}
}
