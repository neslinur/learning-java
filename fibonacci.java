import java.util.Scanner;
class Fibonacci {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
  System.out.println("Give me a number");
    int num = scan.nextInt();
    int a = 0;
    int b = 1;
    for (int i = 0; i < num; i++)
      {
        int c = a+b;
        b=a;
        a = c;
      }
    for (int i = 0; i < num; i++)
      
      {
       System.out.println(b+ " ");
        int c = a - b;
        a = b;
        b = c;
      }
  }
}