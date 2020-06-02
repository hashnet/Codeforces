# Codeforces

# Reading Input
# Using BufferedReader:
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/input.txt")));
String string = br.readLine();
String[] strings = br.readLine().split("\\s+");
int n = Integer.parseInt(strings[0);

# Using Scanner
Scanner sc = new Scanner(new File("src/input.txt"));
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String string = sc.nextLine();
String string = sc.next();
// if the input is like 
// 10
// abc
// the sc.nextInt() will return 10 and then sc.nextLine() will return "" as the curson didn't move to next line and so it returns the empty string till the end of line.
// In this case it is better to use sc.nextInt() to get 10 and then sc.next() to get "abc". sc.next() return the next complete token.



# Writing Output (performance increase)

PrintWriter pw = new PrintWriter(System.out);
pw.println();