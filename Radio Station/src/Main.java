import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Map<String, String> computers = new HashMap<>();
		
		for(int i=1; i<=n; i++) {
			String name = sc.next();
			String ip = sc.next();
			computers.put(ip, name);
		}
		
		for(int i=1; i<=m; i++) {
			String command = sc.next();
			String ip = sc.next();
			ip = ip.substring(0, ip.length()-1);
			String name = computers.get(ip);
			System.out.println(command + " " + ip + "; #" + name);
		}
	}
}
