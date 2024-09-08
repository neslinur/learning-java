import java.util.Scanner;
class Grades {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    
  System.out.println("What is your number grade?");
    double num = scan.nextDouble();

    if (95 <= num && num <= 100)
    {
    System.out.println("You have an A+");
    }
    else if (90 <= num && num < 95)
      {
      System.out.println("You have an A");
      }
    else if (80 <= num && num < 90)
      {
      System.out.println("You have a B");
      }
    else if (70 <= num && num < 80)
      {
      System.out.println("You have a C");
      }
    else if (60 <= num && num < 70)
      {
      System.out.println("You have a D");
      }
    else if (num < 60)
      {
      System.out.println("You have an F");
      }
    else if (100 < num || num < 0)
      {
      System.out.println("Invalid");
      }
  }
}