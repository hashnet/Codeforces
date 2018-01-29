import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int tot = 0;
		for(int i=0; i<5; i++) {
			tot += sc.nextInt();
		}

		System.out.println(tot > 0 && tot%5==0 ? tot/5 : "-1");
	}
}
