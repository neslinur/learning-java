import java.util.Scanner;
import java.util.ArrayList;
class AnimalArrayList {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<String> animals = new ArrayList<String>();

    System.out.println("Please give me 5 animals");
  
    
    for (int i = 0; i < 5; i++){
      String a = scan.nextLine();
      animals.add(a);
    }

     System.out.println(animals);

    for (int j = 0; j < animals.size(); j++){
      if (animals.get(j).length() % 2 != 0){
        animals.remove(j);
        j--;
      }
    }
    System.out.println(animals);
  }
}