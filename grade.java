import java.util.Scanner;
class Grade {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
System.out.println("How many practice grades do you have?");
    int pracnum = scan.nextInt();
   
    System.out.println("How many formal grades do you have?");
    int formnum = scan.nextInt();
  
    System.out.println("How many summative grades do you have?");
    int sumnum = scan.nextInt();
    

    double prac = 0;
    double form = 0;
    double sum = 0;

    
    for (int a = 0; a <pracnum; a++)
      {   System.out.println("What is one of your practice grades?");
       double pracgrade = scan.nextDouble();
      if(pracgrade < 0 || pracgrade > 100 )
    {
      System.out.println("Invalid input.");
    }
       prac += pracgrade;
      }
prac = (prac * .20)/pracnum;
    for (int b = 0; b <formnum; b++)
      {   System.out.println("What is one of your formal grades?");
       double formgrade = scan.nextDouble();
       if(formgrade < 0 || formgrade > 100 )
    {
      System.out.println("Invalid input.");
    }
       form += formgrade;
      }
form = (form * .40)/formnum;
    
    for (int c = 0; c <sumnum; c++)
      {   System.out.println("What is one of your summative grades?");
       double sumgrade = scan.nextDouble();
     if(sumgrade < 0 || sumgrade > 100 )
    {
      System.out.println("Invalid input.");
    }
       sum += sumgrade;
      }
sum = (sum * .40)/sumnum;
    System.out.println((int)(form + prac + sum));

    

           
  }
}