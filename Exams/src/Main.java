import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static class Date implements Comparable{
		int a;
		int b;
		
		public Date(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		@Override
		public int compareTo(Object arg0) {
			Date other = (Date) arg0;
			
			if(this.a == other.a) {
				return this.b - other.b;
			} else {
				return this.a - other.a;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Date> dates = new ArrayList<>();
		int n = sc.nextInt();
		while(n-- > 0) {
			dates.add(new Date(sc.nextInt(), sc.nextInt()));
		}
		
		Collections.sort(dates);
		
		int min = 0;
		for(Date d : dates) {
			if(d.b >= min) {
				min = d.b;
			} else {
				min = d.a;
			}
		}
		
		System.out.println(min);
	}
}
