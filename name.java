import java.lang.Math;
import java.util.Scanner;
class Name {
  public static void main(String[] args) {
    int a = 0;
//N
   for (int i = 0; i <5; i++)
     {
    
                System.out.print("*");

     
       for (int j = 0; j<5; j++)
         {
          
          if (i == j || ((i + j) == (a-1)))
           {
             System.out.print("*");
           }
           else{
             System.out.print(" ");
           }
           
   
     } System.out.print("*");
       System.out.println("");
     }
    System.out.println("");

    //K
     for (int f = 0; f <5; f++)
     {
    
                System.out.print("*");

     
       for (int h = 0; h<5; h++)
         {
          
          if ((f+h) == 2 )
           {
             System.out.print("*");
           }
            else if(f == h+2)
            {
              System.out.print("*");
            }
           else{
             System.out.print(" ");
           }
     } 
       System.out.println("");
     }
System.out.println("");
    //N->M
    for (int i = 0; i <5; i++)
     {
    
                System.out.print("*");

     
       for (int j = 0; j<8; j++)
         {
          
          if (i == j || ((i + j) == (a-1)))
           {
             System.out.print("*");
           }
           if ((i == 3 && j == 4) || (i == 2 && j == 5) || (i == 1 && j == 6) || (i == 0 && j == 7))
                  { 
                    System.out.print("*");
                  }
           else
           {
             
             System.out.print(" ");
           }
           
   
     } 
       System.out.print("*");
       System.out.println("");
     }
    System.out.println("");
    //K->L
for (int i=0;i<5;i++)
  {
    
    for(int j =0;j<7;j++)
           {
             if (j == 0 || i == 4)
             System.out.print("*");
             else
               {
                 System.out.print(" ");
               }
               
           }
    System.out.println(" ");
  }
      
  }
}
