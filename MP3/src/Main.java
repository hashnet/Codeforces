import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static class Pair {
		long val;
		long count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		long I  = sc.nextInt();
		
		long[] arr = new long[n];
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLong();
			
			if(arr[i] < min) min = arr[i];
			if(arr[i] > max) max = arr[i];
		}
		
		long levels = max - min + 1;
		
		long k = 0;
		long K = 1;
		
		while(K < levels) {
			K *= 2;
			++k;
		}
		
		long reqI = n * k;
		if(reqI % 8 == 0) reqI = reqI / 8;
		else reqI = (reqI / 8) + 1;
		
		if(I >= reqI) {
			pr.println(0);
			pr.close();
			sc.close();
			return;
		}
		
		k = (I * 8) / n;
		long level = 1;
		for(int i=1; i<=k; i++) level *= 2;
		
		Arrays.sort(arr);
		List<Pair> counts = new ArrayList<>();
		Pair count = new Pair();
		count.val = arr[0];
		count.count = 1;
		long prev = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i] == prev) {
				++count.count;
			} else {
				counts.add(count);
				
				count = new Pair();
				count.val = arr[i];
				count.count = 1;
			}
			
			prev = arr[i];
		}
		counts.add(count);
		
		int i = 0;
		int j = counts.size()-1;
		long range = counts.get(j).val - counts.get(i).val + 1;
		long result = 0;
		while(range > level && i <= j) {
			if(counts.get(i).count <= counts.get(j).count) {
				result += counts.get(i).count;
				++i;
			} else {
				result += counts.get(j).count;
				--j;
			}
			
			range = counts.get(j).val - counts.get(i).val + 1;
		}
		
		pr.println(result);
		
		pr.close();
		sc.close();
	}
}
