class MatrixMultiply {
    public static void main(String[] args) {
     int[][] arr = new int[3][3];
  
     
      for(int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr[i].length; j++){
          arr[i][j] =(int) (Math.random() * 10);
        } 
      }
  
         int[][] arr2 = new int[3][3];
  
     
      for(int i = 0; i < arr2.length; i++){
        for (int j = 0; j < arr2[i].length; j++){
          arr2[i][j] =(int) (Math.random() * 10);
        } 
      }
  
      int[][] result = multiply(arr1,arr2);
  
      for (int i = 0; i < result.length; i++){
        for (int j = 0; j < result[i].length; j++){
          System.out.print(result[i][j] + " ");
        }
        System.out.println("");
      }
  
      
    }
  
    public static int[][] multiply(int[][] x, int[][] y){
      int row = x.length;
      int a = x[0].length;
      int b = y[0].length;
      int[][] wow = new int[row][b];
  
      for (int i = 0; i < row; i++){
        for (int j = 0; j < b; j++){
          int sum = 0;
          for (int k = 0; k < a; k++){
            sum += x[i][k] * y[k][j];
          }
          wow[i][j] = sum;
        }
      }
      return wow;
    }
  }