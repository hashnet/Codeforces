import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int[] count = new int[10];
		int[] sticks = new int[6];
		
		for(int i=0; i<6; i++) {
			sticks[i] = sc.nextInt();
			++count[sticks[i]];
		}
		
		boolean alien = true;
		int leg = 0;
		for(int i=1; i<=9; i++) {
			if(count[i] >= 4) {
				alien = false;
				leg = i;
				break;
			}
		}
		
		if(alien) {
			System.out.println("Alien");
			return;
		}
		
		int[] hb = new int[2];
		int index = 0;
		int legCount = 0;
		for(int i=0; i<6; i++) {
			if(sticks[i] == leg && legCount < 4) {
				++legCount;
			} else {
				hb[index++] = sticks[i];
			}
		}
		
		if(hb[0] == hb[1]) System.out.println("Elephant");
		else System.out.println("Bear");
	}
}
