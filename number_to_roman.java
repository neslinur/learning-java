import java.util.Scanner;
class NumberToRoman {
  public static void main(String[] args) {
   //1 = I, 5 = V, 10 = X, 50 = L, 100 = C, 500 = D, 1000 = M
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a number from 1 to 3999.");
    int num = scan.nextInt();
int a = 0;
    //M
    if (num >= 1000)
    {
    a = num / 1000;
      for (int i = a; i > 0; i--)
    { System.out.print("M");
    }
      num -= a * 1000;
    }

    if (num >= 900)
      {
        a = num / 900;
        for (int i = a; i > 0; i--)
          {
            System.out.print("CM");
          }
        num -= a * 900;
      }
    //D
        if (num >= 500)
      {
         a = num / 500;
        for (int i = a; i > 0; i--)
    {
      System.out.print("D");
    }
      num -= a * 500;
      }
    
    if (num >= 400)
      {
        a = num / 400;
        for (int i = a; i > 0; i--)
          {
            System.out.print("CD");
          }
        num -= a * 400;
      }
  //C
         if (num >= 100)
      { 
         a = num / 100;
        for (int i = a; i > 0; i--)
    {
      System.out.print("C");
    }
      num -= a * 100;
      }

    if (num >= 90)
      {
        a = num / 90;
        for (int i = a; i > 0; i--)
          {
            System.out.print("XC");
          }
        num -= a * 90;
      }
    
  //L
      if (num >= 50)
      {     
         a = num / 50;
        for (int i = a; i > 0; i--)
    {
      System.out.print("L");
    }
      num -= a * 50;
      }

    if (num >= 40)
      {
        a = num / 40;
        for (int i = a; i > 0; i--)
          {
            System.out.print("XL");
          }
        num -= a * 40;
      }
    //X
    if (num >= 10)
      {

         a = num / 10;
        for (int i = a; i > 0; i--)
    {
      System.out.print("X");
    }
      num -= a * 10;
      }

    if (num >= 9)
      {
        a = num / 9;
        for (int i = a; i > 0; i--)
          {
            System.out.print("IX");
          }
        num -= a * 9;
      }
    //V
    if (num >= 5)
      {
        
         a = num / 5;
        for (int i = a; i > 0; i--)
    {
      System.out.print("V");
    }
      num -= a * 5;
      }

    if (num >= 4)
      {
        a = num / 4;
        for (int i = a; i > 0; i--)
          {
            System.out.print("IV");
          }
        num -= a * 4;
      }
    //I
    if (num >= 1)
      {
        
         a = num / 1;
        for (int i = a; i > 0; i--)
    {
      System.out.print("I");
    }
      num -= a * 1;
      }
}
}