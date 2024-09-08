import java.util.Scanner;
class NamesArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] names = new String[7];

    System.out.println("Give me 7 names.");
    for (int i = 0; i < 7; i++)
      {
        names[i] = scan.nextLine();
      }
    
  System.out.println("");
    
    for (int i = 0; i < 7; i++){
      System.out.println(names[i].substring(names[i].length()-1));
    }
    
  System.out.println("");
    
    for (int i = 0; i < 7; i++){
      System.out.println(names[i].length());
    }
    
  }
} 