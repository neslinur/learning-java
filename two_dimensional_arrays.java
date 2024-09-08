import java.lang.Math;
class TwoDimensionalArrays {
  public static void main(String[] args) {

    //initial
    
    int [][] list = new int[2][4];

    for(int i = 0; i < 2; i++){
      for (int j = 0; j < 4; j++){
        list[i][j] =(int) (Math.random() * 10);
      } 
    }

     for(int i = 0; i < 2; i++){
      for (int j = 0; j < 4; j++){
        System.out.print(list[i][j] + " ");
      } 
       System.out.println();
    }

    System.out.println();

    //add 1

    int [][] nw = new int[2][4];

    for(int i = 0; i < 2; i++){
      for (int j = 0; j < 4; j++){
        nw[i][j] = list[i][j]+1;
      } 
    }

     for(int i = 0; i < 2; i++){
      for (int j = 0; j < 4; j++){
        System.out.print(nw[i][j] + " ");
      } 
       System.out.println();
    }

     System.out.println();

    //add 1 to first row and 2 to second row

    int [][] ad = new int[2][4];

    for(int i = 0; i < 2; i++){
      for (int j = 0; j < 4; j++){
        if (i == 0)
        ad[i][j] = nw[i][j]+1;
        else
        ad[i][j] = nw[i][j]+2;
      } 
    }

     for(int i = 0; i < 2; i++){
      for (int j = 0; j < 4; j++){
        System.out.print(ad[i][j] + " ");
      } 
       System.out.println();
    }
  }
}