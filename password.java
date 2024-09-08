import java.util.Scanner;
class Password {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Create a password.");
    String pass1 = scan.nextLine();

    System.out.println("Confirm your password.");
    String pass2 = scan.nextLine();

    if (pass2.equals(pass1))
    {
      System.out.println("Same");
      
    }
    else
      System.out.println("Not same");
  }
}