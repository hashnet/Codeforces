import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] board = new char[4][4];
		board[0] = br.readLine().toCharArray();
		board[1] = br.readLine().toCharArray();
		board[2] = br.readLine().toCharArray();
		board[3] = br.readLine().toCharArray();
		
		//printBoard(board);
		
		if(checkBoard(board, 0, 0) == true) System.out.println("YES");
		else if(checkBoard(board, 1, 0) == true) System.out.println("YES");
		else if(checkBoard(board, 0, 1) == true) System.out.println("YES");
		else if(checkBoard(board, 1, 1) == true) System.out.println("YES");
		else System.out.println("NO");
	}
	
	private static void printBoard(char[][] board) {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static boolean checkBoard(char[][] board, int row, int col) {
		int cX = 0;
		int cD = 0;
		//check horizontally
		for(int i=row; i<=row+2; i++) {
			cX = 0;
			cD = 0;
			for(int j=col; j<=col+2; j++) {
				if(board[i][j] == 'x') ++cX;
				else if(board[i][j] == '.') ++cD;
			}
			if(cX == 2 && cD == 1) return true;
		}
		//check vertically
		for(int j=col; j<=col+2; j++) {
			cX = 0;
			cD = 0;
			for(int i=row; i<=row+2; i++) {
				if(board[i][j] == 'x') ++cX;
				else if(board[i][j] == '.') ++cD;
			}
			if(cX == 2 && cD == 1) return true;
		}
		//check diagonally topleft to bottomright
		cX = 0;
		cD = 0;
		for(int i=row, j=col; i<=row+2; i++, j++) {
			if(board[i][j] == 'x') ++cX;
			else if(board[i][j] == '.') ++cD;
		}
		if(cX == 2 && cD == 1) return true;
		
		//check diagonally bottomleft to topright
		cX = 0;
		cD = 0;
		for(int i=row+2, j=col; i>=row; i--, j++) {
			if(board[i][j] == 'x') ++cX;
			else if(board[i][j] == '.') ++cD;
		}
		if(cX == 2 && cD == 1) return true;		
		
		return false;
	}
}
