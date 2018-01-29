import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int pos = sc.nextInt();
		
		int[][] matrix = {{1, 1, 2, 2, 0, 0}, {0, 2, 1, 0, 2, 1}, {2, 0, 0, 1, 1, 2}};
		
		n = (n-1)%6;
		System.out.println(matrix[pos][n]);
	}
}