import java.util.Scanner;
import java.lang.Math;

class Random
{
  public static void main(String[] args)
  {

Scanner scan = new Scanner(System.in);

System.out.println("Enter an integer: ");
int a = scan.nextInt();
int b = a + 1;

System.out.println((int)(Math.random() * b) + 2);
System.out.println((int)(Math.random() * b) + 2);
System.out.println((int)(Math.random() * b) + 2);

  }
}