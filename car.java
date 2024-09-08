import java.lang.Math;
import java.util.Scanner;
class Car{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is the speed limit?");
    int limit = scan.nextInt();

    System.out.println("What is the driver's speed?");
    int driver = scan.nextInt();

    double a = Math.random() * 100;

    if ((1.1 * limit) <= driver + a && driver + a < (2 * limit))
    {
      if (a <= 40)
      {
        System.out.println("You get a verbal warning");
        
      }
      else if (40 < a && a < 60)
      {
        System.out.println("You get a written warning");
      }
      else if (a >= 60) 
      {
        System.out.println("You get a fine of " + ((int) (1000 * (Math.random()))));
      }
      // nothing, verbal, written, ticket, jail
    }

      else if (driver + a >= (2 * limit))
    {
      System.out.println("You are going to jail");
    }
    else if (driver + a < (1.1 * limit))
      {
      System.out.println("You got away.");
      }
    else if (driver < limit)
    {
      System.out.println("You are under the speed limit");
    }
  }
}