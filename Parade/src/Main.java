import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("src/input.txt");
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] parade = new int[n+1][2];
		int leftSum = 0;
		int rightSum = 0;
		for(int i=1 ; i<=n ; i++){
			String[] values = br.readLine().split("\\s+");
			parade[i][0] = Integer.parseInt(values[0]);
			parade[i][1] = Integer.parseInt(values[1]);
			
			leftSum+= parade[i][0];
			rightSum+= parade[i][1];
		}
		
		int beauty = Math.abs(leftSum - rightSum);
		int solution = 0;
		int maxBeauty = beauty;
		for(int i=1 ; i<=n ; i++) {
			int newLeftSum = leftSum-parade[i][0] + parade[i][1];
			int newRightSum = rightSum-parade[i][1] + parade[i][0];
		
			int newBeauty = Math.abs(newLeftSum - newRightSum);
			
			if(newBeauty > maxBeauty) {
				maxBeauty = newBeauty;
				solution = i;
			}
		}
		
		System.out.println(solution);
	}
}