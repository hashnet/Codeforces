import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		
		int tramT = sc.nextInt();
		int igorT = sc.nextInt();
		
		int p = sc.nextInt();
		int dirTram = sc.nextInt();
		
		//Time by igor;
		int igor = Math.abs(x2 - x1) * igorT;
		
		if(tramT > igorT) {
			System.out.println(igor);
			return;
		}
		
		//Time by tram;
		int tramD = 0;
		if(x2 < x1) {
			if(dirTram < 0) {
				if(p >= x1) {
					tramD = p - x2;
				} else {
					tramD = p + (2*s) - x2;
				}
			} else {
				tramD = (2*s) - p - x2;
			}
		} else {
			if(dirTram > 0) {
				if(p <= x1) {
					tramD = x2 - p;
				} else {
					tramD = (2*s) - p + x2;
				}
			} else {
				tramD = p + x2;
			}
		}
		int tram = tramD * tramT;
	
		if(tram < igor) {
			System.out.println(tram);
		} else {
			System.out.println(igor);
		}
	}
}
