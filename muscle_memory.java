import java.util.Scanner;
class MuscleMemory {
    public static String reverseWord(String word) 
  {
    String meow = "";

    for (int i = word.length()-1; i >=0; i--)
      {
        meow = meow + word.charAt(i);
      }

    return meow;
    
    }
  public static String reverseAllWords(String sentence) {
  String firstpart="";
    String lastpart=sentence;
    int pos=lastpart.indexOf(" ");
     while (pos >=0)
       {
         firstpart += reverseWord(lastpart.substring(0,pos))+" ";
         lastpart = lastpart.substring(pos+1);
       pos=lastpart.indexOf(" ");
         
        
       }
     return firstpart+reverseWord(lastpart);
  }
   public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("Give me a sentence:");
    String ans = scan.nextLine();

    System.out.println(reverseAllWords(ans));
  }
}