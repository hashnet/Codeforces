import java.util.*;

public class Main {
	private static class Task {
		int start;
		int required;
		int end;
		int[] occupied;
		
		public Task(int start, int required, int end, int n) {
			this.start = start;
			this.required = required;
			this.end = end;
			
			occupied = new int[n+1];
		}
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		List<Task> tasks= new ArrayList<Task>();
		for(int p=0; p<q; p++) {
			int start = sc.nextInt();
			int required = sc.nextInt();
			int end = sc.nextInt() + start - 1;
			
			tasks.add(new Task(start, required, end, n));
		}
		
		//int maxT = tasks.get(tasks.size()-1).end+1;
		
		//int[][] occupied = new int[maxT][n+1];
		
		for(int p=0; p<q; p++) {
			int start = tasks.get(p).start;
			int required = tasks.get(p).required;
			int end = tasks.get(p).end;
			
			int rem = n - tasks.get(p).occupied[0];
			if(rem >= required) {
				int s = 0;
				int count = 0;
				for(int i=1; i<=n; i++) {
					if(tasks.get(p).occupied[i] == 0) {
						++count;
						s += i;
						for(int j=p+1; j<q; j++) {
							if(tasks.get(j).start <= end) {
								++tasks.get(j).occupied[0];
								tasks.get(j).occupied[i] = 1;
							} else {
								break;
							}
						}
						
						if(count >= required) break;
					}
				}
				
				System.out.println(s);
			} else {
				System.out.println("-1");
			}
		}
	}
}
