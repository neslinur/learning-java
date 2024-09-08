import java.util.Scanner;
import java.lang.Math;
class TwoFourteen{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("");
    System.out.println("Mr. Caliskan walks into the classroom and explains the agenda for today. He has decided to take all of his students outside as he realized that they are nerds and barely go outside.");
    System.out.println("");
    System.out.println("Where does he take them?");
    System.out.println("1. Wendys which is close to the school, maybe they can grab some food.");
    System.out.println("2. HEB across the street, maybe they can go shopping.");
    System.out.println("3. The fenced area, it will be safer.");
    int start = scan.nextInt();

    if (1 == start)
    {
      
      System.out.println("");
      System.out.println("Mr. Caliskan decides to take them to Wendys and realizes that there is no room for all of his students.");
    System.out.println("What does he decide to do?");
    System.out.println("1. Ask someone to get up.");
    System.out.println("2. Have everyone sit on the floor.");
      int first = scan.nextInt();

      if (1 == first)
      {
        System.out.println("");
        System.out.println("Mr. Caliskan asks a family to get up and the father gets angry. He throws his drink at Mr. Caliskan and leaves with his family. Mr. Caliskan has gained space for his students but lost his nice clothes.");
      }
      else if (2 == first)
      {
        System.out.println("");
        System.out.println("The Wendys workers realize that they are not sitting in tables so they kick the class out. When we try to get back into school, Mr. Caliskan realizes that they locked all of the doors and the class cannot get in. The class is now stranded outside.");
      }
    }

    else if (2 == start)
    {
      
      System.out.println("");
      System.out.println("Mr. Caliskan decides to take them to HEB where he sees a student steal a candy bar.");
    System.out.println("What does he decide to do?");
    System.out.println("1. Tell the student to put it back.");
    System.out.println("2. Let it go, maybe the student can't afford it.");
      int sec = scan.nextInt();

      if (1 == sec)
      {
        System.out.println("");
        System.out.println("The student puts it back but cries after because apparently he is poor and can't afford to pay for it. The student goes hungry that day.");
      }
      else if (2 == sec)
      {
        System.out.println("");
        System.out.println("An HEB worker sees that Mr. Caliskan let this action go and takes him to jail as he is responsible for the minors.");
      }
    }
    else if (3 == start)
    {
      
      System.out.println("");
      System.out.println("Mr. Caliskan decides to take them to the fenced area where they will be safe. He sees that there is a P.E. class going on outside.");
    System.out.println("What does he decide to do?");
    System.out.println("1. Take the students back inside.");
    System.out.println("2. Go there anyways, there is enough space for both classes.");
      int third = scan.nextInt();

      if (1 == third)
      {
        System.out.println("");
        System.out.println("The students never end up going back outside and develop a vitamin D deficiency. They also become more nerdy.");
      }
      else if (2 == third)
      {
        System.out.println("");
        System.out.println("The P.E. class accidentally kicks a soccer ball to one of Mr. Caliskans students. They get a concussion and have to get hospitalized.");
      }
    }
    
    
  }
}