import java.util.*;

public class Main {
	private static class Date {
		int a;
		int b;
		
		public Date(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Date> dates = new ArrayList<Date>();
		for(int i=0; i<n; i++) {
			dates.add(new Date(sc.nextInt(), sc.nextInt()));
		}
		
		dates.sort(new Comparator<Date>(){
			@Override
			public int compare(Date o1, Date o2) {
				if(o1.a == o2.a) return Integer.compare(o1.b, o2.b);
				else return Integer.compare(o1.a, o2.a);
			}			
		});
		
		int last = dates.get(0).a < dates.get(0).b ? dates.get(0).a : dates.get(0).b;
		
		for(int i=1; i<dates.size(); i++) {
			if(dates.get(i).b >= last) {
				last = dates.get(i).b;
			} else {
				last = dates.get(i).a;
			}
		}
		
		
		System.out.println(last);
	}
}
