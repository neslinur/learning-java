import java.util.Scanner;
class Arrays {
  public static void main(String[] args) {
   int[] integerar = new int[17];
   double[] doublear = new double[17];
   String[] stringar = new String[17]; 
   
  int[] intvalues = {1,2,3,4,5,6,7,8,9};
  double[] doubvalues = {2.5,3.6,4.5,7.8};
  String[] stringvalues = {"nesli","feels","very","sick"};

    Scanner scan = new Scanner(System.in);
    System.out.println("give me a value");
    int a = scan.nextInt();

    int[] pstem6 = new int[17];

    for (int i = 0; i < 17; i++){
      pstem6[i] = a;
    }

    for (int i = 0; i < 17; i++){
      System.out.println(pstem6[i]);
    }
   
   






    
  }
}