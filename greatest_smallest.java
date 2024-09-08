import java.util.Scanner;
class GreatestSmallest {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
System.out.println("How many numbers do you want?");
    int num1 = scan.nextInt();

    int greatest=0;
    int smallest=0;
    
    for (int a = 0; a <num1; a++)
      {   System.out.println("Give me a number.");
       int num2 = scan.nextInt();

       if(a==0){
        greatest=num2;
        smallest=num2;
         
       }

if(num2>greatest){

greatest=num2;
  
}
       else if (num2<smallest)
       {
         smallest = num2;
       }

       
      }
System.out.println("Greatest is " + greatest + " and smallest is " + smallest);
    

           
  }
}