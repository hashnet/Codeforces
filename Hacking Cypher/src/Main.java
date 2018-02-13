import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		boolean found = false;
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) == '0') continue;
			
			BigInteger num1 = new BigInteger(str.substring(0, i));
			BigInteger num2 = new BigInteger(str.substring(i, str.length()));
			
			BigInteger[] divMod1 = num1.divideAndRemainder(a);
			BigInteger div1 = divMod1[0];
			BigInteger mod1 = divMod1[1];
			
			BigInteger[] divMod2 = num2.divideAndRemainder(b);
			BigInteger div2 = divMod2[0];
			BigInteger mod2 = divMod2[1];
			
			if(!div1.equals(BigInteger.ZERO) && mod1.equals(BigInteger.ZERO) && !div2.equals(BigInteger.ZERO) && mod2.equals(BigInteger.ZERO)) {
				found = true;
				
				System.out.println("YES");
				System.out.println(num1);
				System.out.println(num2);
				
				break;
			}
		}
		
		if(!found) {
			System.out.println("NO");
		}
	}
}
