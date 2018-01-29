import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int u = sc.nextInt();
		int p = sc.nextInt();
		int b = sc.nextInt();
		
		int n = sc.nextInt();
		
		List<Long> usb = new ArrayList<Long>();
		List<Long> ps2 = new ArrayList<Long>();
		
		for(int i=0; i<n; i++) {
			long val = sc.nextLong();
			String s = sc.next();
			
			if(s.equals("USB")) usb.add(val);
			else if(s.equals("PS/2")) ps2.add(val);
		}
		
		Collections.sort(usb);
		Collections.sort(ps2);
		
		Queue<Long> usbQueue = new LinkedList<Long>(usb);
		Queue<Long> ps2Queue = new LinkedList<Long>(ps2);
		
		long total = 0;
		int count = 0;
		int range = usbQueue.size();
		for(int i=0; i<u && i<range; i++) {
			total += usbQueue.remove();
		
			++count;
		}
		range = ps2Queue.size();
		for(int i=0; i<p && i<range; i++) {
			total += ps2Queue.remove();
			++count;
		}
		
		int i = 0;
		while(i < b) {
			if(usbQueue.isEmpty() && ps2Queue.isEmpty()) break;
			
			if(usbQueue.isEmpty()) {
				total += ps2Queue.remove();
				++count;
			} else if(ps2Queue.isEmpty()) {
				total += usbQueue.remove();
				++count;
			} else {
				if(usbQueue.peek() <= ps2Queue.peek()) {
					total += usbQueue.remove();
					++count;
				} else {
					total += ps2Queue.remove();
					++count;
				}
			}
			++i;
		}
		
		System.out.println(count + " " + total);
	}
}