import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter("output.txt");
		
		writer.println("100000 0");
		
		for(int i=1; i<=100000; i++) {
			writer.print(i%2==0 ? "1 " : "2 ");
		}
		writer.println();
		
		writer.close();
	}
}
