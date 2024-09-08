import java.util.Scanner;
class Replace {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("give me a word");
    String word = scan.nextLine();
     int len = word.length();
    System.out.println("give me a letter in that word");
    String letter = scan.nextLine();
    
   
    int a = 0;
    int b = 1;
    for (int i = 0; i < len; i++)
      {
        if(true == letter.equals(word.substring(a,b)))
        {
          System.out.print("");
          
        }
        else
        {
          System.out.print(word.substring(a,b));
        }
        a++;
        b++;
      }
  }
}