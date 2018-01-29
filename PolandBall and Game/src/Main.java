import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] pe = br.readLine().split("\\s+");
		int p = Integer.parseInt(pe[0]);
		int e = Integer.parseInt(pe[1]);
		
		List<String> pList = new ArrayList<String>();
		List<String> eList = new ArrayList<String>();
		
		for(int i=0; i<p; i++) {
			pList.add(br.readLine());
		}
		for(int i=0; i<e; i++) {
			eList.add(br.readLine());
		}
		
		int common = 0;
		if(p >= e) {
			for(String s : eList) {
				if(pList.contains(s)) ++common;
			}
		} else {
			for(String s : pList) {
				if(eList.contains(s)) ++common;
			}
		}
		
		p -= common;
		e -= common;
		
		if(common%2 == 0) {
			if (p > e) System.out.println("YES");
			else System.out.println("NO");
		} else {
			if (p >= e) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
