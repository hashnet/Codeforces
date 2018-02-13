import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < (n-1)) {
			System.out.println("-1");
			return;
		}
		
		if(m > ((n*2) +2)) {
			System.out.println("-1");
			return;
		}
		
		int[] oneArr = new int[n+1];
		int oneCount = m;
		int index = 0;
		while(oneCount > 0) {
			if(index > n)  break;
			++oneArr[index++];
			--oneCount;
		}
		index = 0;
		while(oneCount > 0) {
			if(index > n)  break;
			++oneArr[index++];
			--oneCount;
		}
		
		StringBuffer output = new StringBuffer();
		for(int i=0; i<oneArr[n]; i++) {
			output.append("1");
		}
		for(int i=0; i<n; i++) {
			output.append("0");
			for(int j=0; j<oneArr[i]; j++) {
				output.append("1");
			}
		}
		System.out.println(output);
	}
}
