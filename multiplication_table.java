import java.util.Scanner;
class MultiplicationTable {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a number.");
    int a = scan.nextInt();
    int b = 1;
  
    for (int i = 0; i < 10; i++)
      {
        System.out.println(a + " * " + b + " = " + (a*b));
        b++;
      }
  }
}