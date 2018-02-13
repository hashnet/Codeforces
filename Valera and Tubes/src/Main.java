import java.util.Scanner;

public class Main {
	private enum Dir {
		forward, backward
	}
	
	private static class Point {
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	private static Dir dir = Dir.forward;
	private static int r, c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		r = sc.nextInt();
		c = sc.nextInt();
		int t = sc.nextInt();
		
		Point point = new Point(1, 1);
		
		int max = r * c;
		int rem = max;
		for(int i=1; i<t; i++) {
			point = print(point, 2);
			rem -= 2;
			System.out.println();
		}
		print(point, rem);
		System.out.println();
	}
	
	private static Point print(Point point, int len) {
		System.out.print(len + " ");
		for(int i=1; i<=len; i++) {
			System.out.print(point.x + " " + point.y + " ");
			
			if(dir == Dir.forward) {
				if(point.y == c) {
					++point.x;
					dir = Dir.backward;
				} else {
					++point.y;
				}
			} else {
				if(point.y == 1) {
					++point.x;
					dir = dir.forward;
				} else {
					--point.y;
				}
			}
		}
		
		return point;
	}
}
