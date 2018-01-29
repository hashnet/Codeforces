import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		boolean minI = true, maxI = true;
		int min=0, max=0;
		
		while(--n >= 0) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			if(d == 1) {
				if(maxI==true || max>=1900) {
					if(maxI != true) {
						max += c;
					}
					
					if(minI == true) {
						minI = false;
						min = 1900 + c;
					} else {
						min = Math.max(min,1900) + c;
					}
				} else {
					System.out.println("Impossible");
					return;
				}
			} else if(d ==2) {
				if(minI==true || min<=1899) {
					if(maxI == true) {
						maxI = false;
						max = 1899 +c;
					} else {
						max = Math.min(max, 1899) +c;
					}
					
					if(minI != true) {
						min += c;
					}
				} else {
					System.out.println("Impossible");
					return;
				}
			}
		}
		
		System.out.println(maxI==true? "Infinity" : max);
	}
}
