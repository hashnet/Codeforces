import java.util.*;

public class Main {
	private static class Card {
		int index;
		int value;
		
		public Card(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		List<Card> cards = new ArrayList<Card>();
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			cards.add(new Card(i, sc.nextInt()));
		}
		
		cards.sort(new Comparator<Card>() {
			@Override
			public int compare(Card arg0, Card arg1) {
				return Integer.compare(arg0.value, arg1.value);
			}			
		});
		
		for(int i=0; i<n/2; i++) {
			System.out.println(cards.get(i).index + " " + cards.get(n-1-i).index);
		}
	}
}
