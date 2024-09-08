import java.util.Scanner;
class Square {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is a side of your square.");
    int a = scan.nextInt();
    int b = 1;
    for (int i = 0; i < a; a--)
      {
        System.out.println(b + " square is " + b + "*" + b + " which is " + (b*b));
        b++;
      }
  }
}