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


# Writing Output (performance increase)

PrintWriter pw = new PrintWriter(System.out);
pw.println();