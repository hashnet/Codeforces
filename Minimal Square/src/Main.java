import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        for(int i=0; i<N; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	int x = Math.min(a, b);
        	int y = Math.max(a, b);
        	
        	x *= 2;
        	y = Math.max(x, y);
        	
        	System.out.println(y * y);
        }
    }
}
