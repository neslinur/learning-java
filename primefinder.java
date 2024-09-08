import java.util.Scanner;
class PrimeFinder
  {
public static boolean isPrime(int num)
  {
  for (int i = 2; i < num; i++)    {
    if (num % i == 0)
    {
      return false;
    }
  }
    return true;
  }
    public static int primesBetween(int lower,int upper)
    {
      int b = 0;
      for (int i = lower; i <= upper; i++)
        {
          if (isPrime(i))
          {
            b++;
          }
        }
      return b;
    }
  public static int gapToNextPrime(int num)
    {
      int b = num;
     while (!(isPrime(num)))
       {
       num++;  
       }  
    num -= b;
      return num;
    }   
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    System.out.println("Give me a lower and then a higher number.");
    int l = scan.nextInt();
    int h = scan.nextInt();
    int a = 0;
    if (primesBetween(l,h) == 1)
    {
    System.out.println("There is " + primesBetween(l,h) + " prime number in between " + l + " and " + h);  
    }
    else 
    { System.out.println("There are " + primesBetween(l,h) + " prime numbers in between " + l + " and " + h);}
    System.out.println("Give me a number.");
    int b = scan.nextInt();
    if (gapToNextPrime(b) == 1)
    {
      System.out.println("There is " + gapToNextPrime(b) + " number until next prime number.");
    }
    else
    {System.out.println("There are " + gapToNextPrime(b) + " numbers until next prime number.");}
  }
  }
