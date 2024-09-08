import java.util.Scanner;
class EvenOddAgain {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("give me a number");
    int a = scan.nextInt();
    int odd = 1;
    int even = 2;
    System.out.print("Odd: ");
    while (odd <= a)
      {
        System.out.print(odd + " ");
      
          odd+=2;
     
        
      }
    System.out.println("");
    System.out.print("Even: ");
    while (even <= a)
      {
        System.out.print(even + " ");
      
          even+=2;
     
        
      }
  }
}