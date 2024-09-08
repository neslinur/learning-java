import java.util.Scanner;
class Names {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      System.out.println("Give me a word.");
    String a = scan.nextLine();
System.out.println("Give me two numbers.");
int num1 = scan.nextInt();
    int num2 = scan.nextInt();
  int b = a.length();
    if (num1 > b || b < num2)
    {
      System.out.println("Out of boundaries.");
    }
      else if (num1 == num2)
      {
        System.out.println(a.substring(num1 - 1, num1 ));
      }
    else if (num2 > num1)
      
    {

    String c = a.substring(num1 - 1,num2 );
    System.out.println(c);
    }
    else if (num1 > num2)
      {
      
    String c = a.substring(num2 - 1,num1);
    System.out.println(c);
      }
    
  }
}