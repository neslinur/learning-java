import java.util.Scanner;
class OddOrEven {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
System.out.println("How many numbers do you want?");
    int num1 = scan.nextInt();

    int odd = 0;
    int even = 0;
    for (int a = 0; a <num1; a++)
      {   System.out.println("Give me a number.");
       int num2 = scan.nextInt();
     if (num2 %2 == 1)
     {
       odd++;
     }
       else if (num2 %2 == 0)
     {
       even++;
     }
      }
System.out.println("We have " + odd + " odds and " + even + " evens.");
    

           
  }
}