import java.lang.Math;
import java.util.Scanner;
class Cointoss {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many times are you tossing the coin?");
    int a = scan.nextInt();
    int heads = 0;
    int tails = 0;
    for (int i = 0; i < a; i++)
      {
int c = (int) (Math.random() * 2);
        if(c == 0)
        {
          heads++;
        }
    else
        {
          tails++;
        }
      }
    System.out.println(heads + " heads " + tails + " tails.");
  }
}