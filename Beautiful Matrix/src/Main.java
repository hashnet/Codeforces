import java.io.*;
import java.util.*;

public class Main {
	private static final int size = 5;
	
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new File("src/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int rowIndex = 0;
		int colIndex = 0;
		for(int i=0 ; i<size ; i++){
			for(int j=0 ; j<size ; j++){
				int num = sc.nextInt();
				if(num == 1) {
					rowIndex = i;
					colIndex = j;
				}
			}
		}
		
		rowIndex = Math.abs(rowIndex - 2);
		colIndex = Math.abs(colIndex - 2);
		
		System.out.println(rowIndex + colIndex);
	}
}