import java.lang.Math;
import java.util.Scanner;
public class DiceRolls {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many times are you rolling the dice?");
    int a = scan.nextInt();
    int dice = 0;
    int greatest = 0;
    int smallest = 0;
    int roll = 0;
    for (int i = 0; i < a; i++)
      {
int c = (int) (Math.random() * 6+1);
         

        if(c == 1)
        {
          roll = 1;
        }
    else if (c== 2)
        {
          roll = 2;
        }
        else if (c == 3)
        {
          roll = 3;
        }
        else if (c==4)
        {
          roll = 4;
        }
           else if (c==5)
        {
          roll = 5;
        }
        else
        {
          roll = 6;
        }
          if(i==0){
        greatest=roll;
        smallest=roll;
         
       }

if(roll>greatest){

greatest=roll;
  
}
       else if (roll<smallest)
       {
         smallest = roll;
       }
        dice += roll;
      }
    int average = (int)(dice / a);
    System.out.println("You rolled " + a + " times. You got an average of " + average + " with your greatest being " + greatest + " and smallest being " + smallest);
  }
}
