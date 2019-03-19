import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
	private static final int MAX = 10_000_000;
	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(
//						new FileInputStream("src/input.txt")));
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						System.in));
		
		
		int size = Integer.parseInt(br.readLine());
		String[] nums = br.readLine().split(" ");
		long[] freq = new long[MAX + 1];
		for(int i=0; i<size; i++) {
			++freq[Integer.parseInt(nums[i])];
		}
		
		long[] partialSum = new long[MAX + 1];
		boolean[] isComposite = new boolean[MAX + 1];
		for(int i=2; i<= MAX; i++) {
			if(!isComposite[i]) {
				long sum = freq[i];
				for(int j = i+i; j <= MAX; j += i) {
					sum += freq[j];
					isComposite[j] = true;
				}
				
				partialSum[i] = sum;
			}
		}
		
		for(int i=2; i<= MAX; i++) {
			partialSum[i] += partialSum[i-1];
		}
		
		size = Integer.parseInt(br.readLine());
		for(int i=0; i<size; i++) {
			nums = br.readLine().split(" ");
			int left = Integer.parseInt(nums[0]);
			if(left > MAX) {
				System.out.println(0);
				continue;
			}
			int right = Integer.parseInt(nums[1]);
			if(right > MAX) {
				right = MAX;
			}
			long count = partialSum[right] - partialSum[left-1];
			System.out.println(count);
		}
		
		br.close();
	}	
}
