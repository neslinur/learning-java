import java.util.Scanner;
class If {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter an integer:");
    int x = scan.nextInt();

    if (!(x <= 10))
      { 
      System.out.println("Number is not less than or equal to 10.");
      }
    else
    {
      System.out.println("Number is less than or equal to 10.");
    }
    
  }
}