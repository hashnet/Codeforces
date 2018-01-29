import java.util.*;

public class Main {
	private class Dragon {
		private int strength;
		private int bonus;
		
		public Dragon(int strength, int bonus) {
			this.strength = strength;
			this.bonus = bonus;
		}
	}
	
	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int n = sc.nextInt();
		
		List<Dragon> dragons = new ArrayList<Dragon>();
		Main myMain = new Main();
		
		for(int i=0; i<n; i++) {
			dragons.add(myMain.new Dragon(sc.nextInt(), sc.nextInt()));
		}
		
		dragons.sort(new Comparator<Dragon>() {

			@Override
			public int compare(Dragon arg0, Dragon arg1) {
				if(arg0.strength < arg1.strength) return -1;
				else if(arg0.strength > arg1.strength) return +1;
				else if(arg0.strength == arg1.strength) {
					if(arg0.bonus < arg1.bonus) return +1;
					else if(arg0.bonus > arg1.bonus) return -1;
					else return 0;
				}
				
				return 0;
			}
			
		});
		
		boolean levelFailed = false;
		for(int i=0; i<n; i++) {
			if(s > dragons.get(i).strength) {
				s+= dragons.get(i).bonus;
			} else {
				levelFailed = true;
				break;
			}
		}
		
		System.out.println(levelFailed ? "NO" : "YES");
	}
}
