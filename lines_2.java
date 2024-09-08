import java.util.Scanner;
import java.lang.Math;
class Lines2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("give me a name");
    String name = in.nextLine();
    int len = name.length();
    int a = (int) Math.sqrt(len);
    double b = Math.sqrt(len);
    int c = 0;
    
    if (b % a != 0)
      {
        a++;
      }


    for (int i = 0; i < a*a -len; i++)
      {
        name += " ";
      }
    for (int i = 0; i < a; i++)
      {
        for (int j = 0; j < a; j++)
          {
            System.out.print(name.substring(c,c+1));
            c++;
          }
        System.out.println("");
      }
  }
}