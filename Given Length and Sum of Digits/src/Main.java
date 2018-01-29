import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		if(s == 0 && m > 1) {
			System.out.println("-1 -1");
			return;
		} else if (s == 0 && m == 1) {
			System.out.println("0 0");
			return;
		}
		
		int cNine = s/9;
		int cOther = s%9;
		int cTotal = cOther == 0 ? cNine : cNine +1;
		
		if (cTotal > m) { 
			System.out.println("-1 -1");
			return;
		}
		
		int[] max = new int[m];
		int[] min = new int[m];
		

		int iter, count;
		//count max
		for(iter=0; iter<cNine; iter++) {
			max[iter] = 9;
		}			
		if(cOther != 0) {
			max[iter] = cOther;
		}
		
		//count min
		if(cOther == 0) {
			cOther = 9;
			--cNine;
		}
		for(iter=m-1, count=1; count<=cNine; --iter, count++) {
			min[iter] = 9;
		}
		if((m-cNine) > 1) {
			min[iter] = cOther-1;
			min[0] = 1;
		} else {
			min[0] = cOther;
		}
		
		
		for(int i=0; i<m; i++){
			System.out.print(min[i]);
		}
		System.out.print(" ");
		for(int i=0; i<m; i++){
			System.out.print(max[i]);
		}
	}
}
