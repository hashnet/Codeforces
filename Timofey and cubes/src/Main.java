import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] as = br.readLine().split("\\s+");
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(as[i]);

		for (int i = 0; i < n; i++) {
			if (n%2!=0 || i <= (n - 1) / 2) {
				if (i % 2 == 0) {
					System.out.print(a[n - i - 1] + " ");
				} else {
					System.out.print(a[i] + " ");
				}
			} else {
				if (i % 2 != 0) {
					System.out.print(a[n - i - 1] + " ");
				} else {
					System.out.print(a[i] + " ");
				}
			}
		}

		System.out.println();
	}
}