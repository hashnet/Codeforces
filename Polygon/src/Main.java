import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(new File("src/input.txt"));
			int N = sc.nextInt();
			while(N-- > 0) {
				int size = sc.nextInt();
				//sc.nextLine();
				int[][] matrix = new int[size][size];
				for(int i=0; i<size; i++) {
					String line = sc.next();
					for(int j=0; j<size; j++) {
						matrix[i][j] = line.charAt(j) - '0';
					}
				}
				
				System.out.println(checkValid(matrix, size) ? "YES" : "NO");
			}

		sc.close();
	}
	
	private static boolean checkValid(int[][] matrix, int size) {
		for(int i=size-2; i>=0; i--) {
			for(int j=size-2; j>=0; j--) {
				if(matrix[i][j] == 1) {
					if(matrix[i+1][j] == 0 &&  matrix[i][j+1] == 0) return false;
				}
			}
		}
		
		return true;
	}
}
