import java.util.Scanner;
class Stairs {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    System.out.println("Give me a number:");
    int a = scan.nextInt();


       for (int j = 0; j<a; j++)
         {
           
           for (int i = 0; i<a; i++)
            { 
              if (i==j)
           {
             System.out.print("*");
           }
           else
           {
             System.out.print(" ");
           }
            }
           
   System.out.println(" ");
         }


  }
}