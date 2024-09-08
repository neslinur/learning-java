import java.util.Scanner;
class Siblings {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
System.out.println("How many siblings do you have?");
    int b = scan.nextInt();
    String result = "";
    for (int a = 0; a <b; a++)
      {   System.out.println("What is one of their names.");
       String c = scan.next();
     
       result+=c;
       result+= " ";
      }
System.out.println("Your " + b + " siblings names are " + result);
    

           
  }
}