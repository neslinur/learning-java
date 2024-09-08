import java.util.ArrayList;
import java.lang.Math;
class SudokuLevel1 {
  public static void main(String[] args) {
    //initial

    ArrayList<Integer> arr = new ArrayList<Integer>();

    for (int i = 0; i < 9; i++){
      arr.add(i+1);
    }
    
    int [][] list = new int[3][3];

    for(int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        int a = (int)(Math.random()*arr.size());
        list[i][j]= arr.get(a);
        arr.remove(a);
      } 
    }

     for(int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        System.out.print(list[i][j] + " ");
      } 
       System.out.println();
    }

    System.out.println();
  }
}