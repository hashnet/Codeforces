import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] groups = br.readLine().split("\\s+");
		int one=0, two=0, three=0, four=0;
		for(int i=0 ; i<n ; i++) {
			int g = Integer.parseInt(groups[i]);
			
			if(g==1) ++one;
			else if(g==2) ++two;
			else if(g==3) ++three;
			else if(g==4) ++four;
		}
		
		int count = 0;
		
		count+=four;
		
		one-=three;
		if(one < 0) one = 0;
		count+=three;
		
		if((two%2) != 0) { 
			one-=2;
			if(one < 0) one =0;
			count+=1;
		}
		count+=(two/2);
		
		count+=(one+4-1)/4;
		
		
		System.out.println(count);
	}
}