import java.util.Scanner;
class Lines {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("give me a name");
    String name = in.nextLine();
    int len = name.length();
    int a = 0;
    int b = 1;
    int c = 4;
    if (len <= 4)
    {
      if (len > 2)
      {
        System.out.println(name.substring(0, 2));
        System.out.println(name.substring(2,len));
      }
      else
      {
        System.out.println(name.substring(0, len));
      }
    }
    else 
    {
      for (int i = 0; i < len; i++)
        {
          if (c == b)
          {
            System.out.println("");
            c+=3;
          }
          System.out.print(name.substring(a,b));
          a++;
          b++;
        }
    }
      
  }
}