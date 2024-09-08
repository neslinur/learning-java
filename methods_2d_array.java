import java.lang.Math;
class Methods2dArray {
  public static void main(String[] args) {
    int[][] x = CreateRandom2D(3);
    int[][] y = CreateRandom2D(3);
    int[][] result = Add(x,y);

    
    display(x);
    
    System.out.println("");
    
    display(y);

    System.out.println("");

    display(result);
    
    System.out.println("");
    
    display(x,y);
    

    System.out.println("");
    
    display(x,y,result);
    
  }

  //createrandom
  public static int[][] CreateRandom2D(int a){
    int[][] x = new int[a][a];

    for(int i = 0; i < a; i++){
      for (int j = 0; j < a; j++){
        x[i][j] =(int) (Math.random() * 10);
      } 
    }

    return x;
  }

  //add
  public static int[][] Add(int[][] x, int[][] y){
    int[][] arr = new int[x.length][x.length];

    for (int i = 0; i < x.length; i++){
      for (int j = 0; j < x[i].length; j++){
        arr[i][j] = x[i][j] + y[i][j];
      }
    }

    return arr;
  }

  //display
  public static void display(int x[][]){
    for (int i = 0; i < x.length; i++){
      for (int j = 0; j < x[i].length; j++){
        System.out.print(x[i][j] + " ");
      }
      System.out.println("");
    }
  }

  //display2
  public static void display(int x[][], int [][] y){
    for (int i = 0; i < x.length; i++){
      for (int j = 0; j < x[i].length; j++){
        System.out.print(x[i][j] + " ");
      }
      System.out.print("    ");
      for (int k = 0; k < y[i].length; k++){
        System.out.print(y[i][k] + " ");
      }
      System.out.println("");
    }
  }

  //display3
  public static void display(int x[][], int [][] y, int[][] z){
    for (int i = 0; i < x.length; i++){
      for (int j = 0; j < x[i].length; j++){
        System.out.print(x[i][j] + " ");
      }
      System.out.print("    ");
      for (int k = 0; k < y[i].length; k++){
        System.out.print(y[i][k] + " ");
      }
      System.out.print("    ");
      for (int o = 0; o < z[i].length; o++){
        System.out.print(z[i][o] + " ");
      }
      System.out.println("");
    }
  }
  
}