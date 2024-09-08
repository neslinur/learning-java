import java.util.Scanner;
class DogtoHuman {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How old is your dog?");
    int a = scan.nextInt();
    int b = 1;
    for (int i = 0; i < a; a--)
      {
        System.out.println(b + " human years is " + (b * 7) + " dog years.");
        b++;
      }
  }
}

