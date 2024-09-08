import java.lang.Math;
class RandomArray {
  public static void main(String[] args) {
   int[] intgrades = new int[17];
    for (int i = 0; i < 17; i++){
      intgrades[i] = (int) (Math.random() * 100);
    }

     for (int i = 0; i < 17; i++){
      System.out.println(intgrades[i]);
    }

    int small = intgrades[0];
    int big = intgrades[0];

    for (int i = 0; i < 17; i++){
      if (intgrades[i] < small){
        small = intgrades[i];
      }
      if (intgrades[i] > big){
        big = intgrades[i];
      }
    }

    System.out.println("The smallest number is " +small);
    System.out.println("The biggest number is " +big);

    
    
    
  }
}