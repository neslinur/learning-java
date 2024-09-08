import java.util.Scanner;
class NameCountdown {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scan.nextLine();
    int a = name.length();
       int b = 1;
    int c = 0;
    for (int i = 0; i < a; a--)
      {
        System.out.println(name.substring(0+c,b));
        c = b++;
      }
  }
}