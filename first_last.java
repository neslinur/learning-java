import java.util.Scanner;
class FirstLast {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      System.out.println("Give me a word.");
    String a = scan.nextLine();

    int b = a.length();
    String c = a.substring(0,1);
    String d = a.substring(b-1,b);
    System.out.println(c + d);
  }
}