import java.util.Scanner;
class JumbleWords {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("give me a name");
    String name = in.nextLine();
    int len = name.length();
    int a = 0;
    int b = len;
    int c = 0;
    int d = 0;
    for (int i = 0; i < len; i++)
      {
        System.out.print(name.substring(a,b));
        System.out.print(name.substring(c,d));
        System.out.println("");
        a++;
        d++;
      }
  }
}