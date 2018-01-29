import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new File("src/input.txt"));
		
		String str = sc.next();
		long n = Long.parseLong(str.substring(0, str.length()-1));
		char c = str.charAt(str.length()-1);
		
		long[] seatVal = new long[6];
		seatVal[0] = 4;
		seatVal[1] = 5;
		seatVal[2] = 6;
		seatVal[3] = 3;
		seatVal[4] = 2;
		seatVal[5] = 1;
		
		long temp = ((n-1)/4)*2;
		long time = ((temp + ((n-1)%2)) * 7) + temp;
		time += seatVal[c-'a'];
		
		System.out.println(time);
	}
}
