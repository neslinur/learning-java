import java.util.ArrayList;
class SimpleSearch {
  public static void main(String[] args) {
    ArrayList<Integer> x = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++){
      x.add((int)(Math.random()*100));
    }

    for (Integer a : x){
      System.out.println(a);
    }

    //linear search

    int val = 7;
    int ind = -1;

    for(int i = 0; i < x.size(); i++){
      if (x.get(i) == val){
        ind = i;
      }
    }
    if (!(x.indexOf(7) == -1))
    System.out.println(val + " is at ind " + ind);
    else
      System.out.println("There is no " + val);

  //binary search

    
    
  }
}