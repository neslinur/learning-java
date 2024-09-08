
import java.util.Scanner;
class PrintString
{
   public static void main(String[] args)
     {

Scanner scan = new Scanner(System.in);

System.out.println("Enter a string:");

String a = scan.nextLine();

System.out.println("How many characters would you like to delete at the end?");

int b = scan.nextInt();

int c = a.length() - b;

System.out.println(a.substring(0, c));
   }
}