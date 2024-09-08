import java.util.Scanner;
class Spaces {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("give me a name");
    String name = in.nextLine();
    int a = name.length();
    int b = 0;
    int o = 1;
    while (b < a)
      {
        for (int i = 0; i < b; i++)
          {
            System.out.print(" ");
          }
        System.out.print(name.substring(b,o));
        
        b++;
        o++;  
      }
      
  }
}