import java.util.ArrayList;
import java.util.Scanner;
class X1Y1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<String> arr = new ArrayList<String>();
    arr.add("Dog");
    arr.add("Cat");
    arr.add("Rabbit");

    System.out.println(arr);

    String ans = "";
    String ani = "";
    int pos = 0;

    while (!ans.equals("q")){
      System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace or (q)uit?");

      ans = scan.nextLine();

      if (ans.equals("a")){
        System.out.println("Enter an animal:");
        ani = scan.nextLine();
        arr.add(ani);
        System.out.println(arr);
      }
      else if (ans.equals("i")){
        System.out.println("Enter an animal:");
        ani = scan.nextLine();
        System.out.println("Enter a position:");
        pos = scan.nextInt();
         scan.nextLine();
        if (pos > arr.size() || pos <= 0){
          System.out.println("Bad position!");
    
        }
        else {
          arr.add(pos-1, ani);
        }
        System.out.println(arr);
      }
      else if (ans.equals("r")){
        System.out.println("Enter a position:");
        pos = scan.nextInt();
        scan.nextLine();
        arr.remove(pos-1);
        System.out.println(arr);
      }
      else if (ans.equals("p")){
         System.out.println("Enter an animal:");
        ani = scan.nextLine();
        System.out.println("Enter a position:");
        pos = scan.nextInt();
        scan.nextLine();
        if (pos > arr.size() || pos <= 0){
          System.out.println("Bad position!");
        }
        else {
          arr.set(pos-1, ani);
        }
        System.out.println(arr);
      }
    }
    
  }
}