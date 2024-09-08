import java.util.Scanner;
class MostCommon {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    System.out.println("give me a word");
    String word = scan.nextLine();
    int len = word.length();
    char common =' ';
    int a = 0;
    for (int i = 0; i < len; i++)
      {
        char current = word.charAt(i);
        int b = 0;
        for (int j = 0; j < len; j++)
          {
            if (word.charAt(j) == current)
            {
              b++;
            }          
            }
         if (b > a)
            {
              common = current;
              a = b;
          }
      }
    System.out.println("The most common character is " + common + " which occurs " + a + " times.");
  }
}