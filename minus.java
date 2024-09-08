import java.util.Scanner;
class Minus {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a number.");
    int a = scan.nextInt();
    for (int i = a; i >= 0; i--)
      {
        int b = a--;
        System.out.println(b);
        
      }
  }
}