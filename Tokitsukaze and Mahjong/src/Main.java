import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strs = br.readLine().split("\\s+");
		int[] tiles = new int[3];
		for(int i=0; i<3; i++) {
			tiles[i] = Integer.parseInt(strs[i].substring(0, 1));
			if(strs[i].charAt(1) == 'm') tiles[i] += 10;
			else if(strs[i].charAt(1) == 'p') tiles[i] += 30;
			else if(strs[i].charAt(1) == 's') tiles[i] += 50;
		}
		
		Arrays.sort(tiles);
		
		int match = 1;
		int series = 1;
		if(tiles[1] == tiles[0]) ++match;
		if(tiles[2] == tiles[1]) ++match;
		
		if(tiles[1] - tiles[0] == 1 && tiles[2] - tiles[1] == 1) {
				System.out.println(0);
				return;
		} else if(tiles[1] - tiles[0] == 1 || tiles[1] - tiles[0] == 2) {
			series = 2;
		} else if(tiles[2] - tiles[1] == 1 || tiles[2] - tiles[1] == 2) {
			series = 2;
		}
		
		System.out.println(3 - Math.max(match, series));
	}
	
}
