import java.util.Scanner;
class StudentsArraysStuff {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    System.out.println("Give me an integer.");
    int n = scan.nextInt();
    
    Student today[] = new Student[n];

    today[0] = new Student("Joseph", "Math", "male", 50, 2.3);
    today[1] = new Student("Hailey", "Music", "female", 99, 4.5);
    today[2] = new Student("Patrick", "Gym", "male", 20, 0.2);
    today[3] = new Student("Serephina", "Health", "female", 100, 5.0);
    today[4] = new Student("Jeremy", "Spanish", "male", 0, 0.0);

    String messages[] = new String[5];
    
    for (int i = 0; i < 5; i++){
      messages[i] = today[i].sendMessage();
    }

    for (int i = 0; i < 5; i++){
      System.out.println(messages[i]);
    }
    
    int s[] = {7,6,5,7,11,13};
    int temp[] = new int[6];

    for (int i = 0; i < s.length; i++){
      System.out.print(s[i] + " ");
    }

    System.out.println("");
    
    for (int i = 0; i < s.length; i++){
      temp[i] = s[s.length-1-i];
    }

    for (int i = 0; i < s.length; i++){
      s[i]=temp[i];
    }

    for (int i = 0; i < s.length; i++){
      System.out.print(s[i] + " ");
    }
    
  }
}