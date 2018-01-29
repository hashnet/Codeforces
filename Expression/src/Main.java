import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int sum1 = a+b+c;
		int sum2 = a*b*c;
		int sum3 = (a+b)*c;
		int sum4 = a*(b+c);
		
		int output = sum1;
		if(output < sum2) output = sum2;
		if(output < sum3) output = sum3;
		if(output < sum4) output = sum4;
		
		System.out.println(output);
	}
}
