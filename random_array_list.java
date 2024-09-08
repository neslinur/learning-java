import java.lang.Math;
import java.util.ArrayList;
class RandomArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> rand = new ArrayList<Integer>(10);
    ArrayList<Integer> rand2 = new ArrayList<Integer>(10);

    for (int i = 0; i < 10; i++){
      rand.add(i,(int)(Math.random() * 10));
    }

    System.out.println(rand);

    int temp = 0;

    for (int i = 0; i < 10; i++){
      for (int j = 0; j < 10; j++){
        if ( rand.get(i)< rand.get(j)){
          temp = rand.get(i);
          rand.set(i, rand.get(j));
          rand.set(j, temp);
        }
      }
    }

    System.out.println(rand);

    /*
    int smallest = Integer.MAX_VALUE;
    
    for (int j = 0; j < rand2.size(); j++){
      for (int a : rand)
      {
        if (a < smallest){
          smallest = a;
        }
      }
        rand2.add(j,smallest);
        rand.set(j,Integer.MAX_VALUE);
    }

    System.out.println(rand2);
    */
  }
}