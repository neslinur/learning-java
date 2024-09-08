import java.util.ArrayList;
import java.util.Scanner;
class Array_List {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<String>();
    System.out.println(names);
    names.add("larry");
    System.out.println(names);
    names.add("asim");
    System.out.println(names);
    names.add("cedric");
    System.out.println(names);
    names.add("alex");
    System.out.println(names);
    names.add(1,"FC");
    System.out.println(names);
    names.add(4,"nesli");
    System.out.println(names);
    System.out.println(names.size());
    names.remove(3);
    System.out.println(names);
    names.set(0,"yusuf");
    System.out.println(names);

    String x = names.get(2);
    System.out.println(x);
    System.out.println(names.size()-1);

    
    
  }
}