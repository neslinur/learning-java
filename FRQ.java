import java.util.Scanner;
class FRQ {
    public static String reverseWord(String word) 
  {
    String polly = "";

    for (int i = word.length()-1; i >=0; i--)
      {
        polly = polly + word.charAt(i);
      }

    return polly;
    
    }
  public static String reverseAllWords(String sentence) {
   String a = "";
    sentence += "";
    int b = 0;
    int c = sentence.length();
    

    for (int i = 0; i < c; i++)
      {
        String d = sentence.substring(b, i+1);
        String e = sentence.substring(i,i+1);
        if (e.equals(""))
        {
          a += reverseWord(d);
        }
        if (i == (c-1))  
        {
          a += reverseWord(d);
        }
      }
    return a;
  }
   public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("Give me a sentence:");
    String ans = scan.nextLine();

    System.out.println(reverseAllWords(ans));
  }
}