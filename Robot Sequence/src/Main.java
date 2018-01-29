import java.io.*;

public class Main {
	private static class Dir {
		int u;
		int d;
		int r;
		int l;
		
		public Dir(int u, int d, int r, int l) {
			this.u = u;
			this.d = d;
			this.r = r;
			this.l = l;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
	
		int u=0, d=0, r=0, l=0;
		Dir[] dirs = new Dir[n+1];
		dirs[0] = new Dir(0, 0, 0, 0);
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == 'U') ++u;
			else if(str.charAt(i) == 'D') ++d;
			else if(str.charAt(i) == 'R') ++r;
			else if(str.charAt(i) == 'L') ++l;
			
			dirs[i+1] = new Dir(u, d, r, l);
		}
		
		int count = 0;
		for(int i=1; i<=n-1; i++) {
			for(int j=i+1; j<=n; j++) {
				int dU = dirs[j].u - dirs[i-1].u;
				int dD = dirs[j].d - dirs[i-1].d;
				int dR = dirs[j].r - dirs[i-1].r;
				int dL = dirs[j].l - dirs[i-1].l;
				
				if(dU == dD && dR == dL) ++count;
			}
		}
		
		System.out.println(count);
	}
}
