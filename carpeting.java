import java.util.Scanner;
class Carpeting{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter your rooms length and breadth.");
    double length = scan.nextDouble();
    double breadth = scan.nextDouble();

    double area = length * breadth;
    double perimeter = length * 4;

    System.out.println("Your rooms length is " + length + ". It's breadth is " + breadth + ". It's area is " + area + ". It's perimeter is " + perimeter + ".");
  }
}