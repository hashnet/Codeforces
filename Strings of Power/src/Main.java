import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		Queue<Integer> h = new LinkedList<Integer>();
		Queue<Integer> m = new LinkedList<Integer>();
		
		int index = -1;
		while((index = str.indexOf("heavy", index+1)) >= 0) {
			h.add(index);
		}		
		index = -1;
		while((index = str.indexOf("metal", index+1)) >= 0) {
			m.add(index);
		}
		
		long count = 0;
		while(h.size()>0 && m.size()>0) {
			while(m.size()>0 && m.peek().intValue()<=h.peek().intValue()) {
				m.remove();
			}
			
			count += m.size();
			h.remove();
		}
		
		System.out.println(count);
	}
}
