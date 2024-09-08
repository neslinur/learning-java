import java.lang.Math;
import java.util.Scanner;
class GreatestDivisor {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    System.out.println("Give me 2 numbers.");
    int a = scan.nextInt();
    int b = scan.nextInt();
    System.out.println(GreatDivisor(a,b));
  }
    public static Integer GreatDivisor(int a, int b)
  {
    int min = Math.min(a,b);
    int output = 0;
    for ( int i = min; i > 1; i--)
      {
        if (a % i == 0 && b % i == 0)
        {
          output+=i;
        
        break;
        }
      }
    return output;
  }
}