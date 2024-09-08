import java.util.Scanner;
class MilkOnTheWall {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a number.");
    int a = scan.nextInt();
    int b = a;
    for (int i = a; i >= 0; i--)
      {
        System.out.println(b + " bottles of milk on the wall,");
                System.out.println(b + " bottles of milk,");
        System.out.println("Take one down, pass it around,");
        b = a--;
        if(b==0)
        {
          System.out.println("No more bottles of milk on the wall.");
        }
        else
        {System.out.println(b + " bottles of milk on the wall.");}
System.out.println("");
        
      }
  }
}