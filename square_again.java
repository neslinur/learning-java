import java.util.Scanner;
class SquareAgain {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    System.out.println("Give me a number:");
    int a = scan.nextInt();

   for (int i = 0; i <a; i++)
     {
    
     
       for (int j = 0; j<a; j++)
         {
          
          if (i == 0 || j ==0 || j==(a-1) || i==(a-1))
           {
             System.out.print("*");
           }
           else{
             System.out.print(" ");
           }
   
     } System.out.println("");
     }
  }
}    
}
