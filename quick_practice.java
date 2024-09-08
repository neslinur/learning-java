class QuickPractice {
    public static void main(String[] args) {
      int arr[] = {3,2,1};
  
      System.out.println(mystery(arr));
    }
  
    public static boolean mystery(int[] values){
      for (int i = 1; i < values.length; i ++){
        if (values[i-1] > values[i]){
          return true;      
        }
      }
      return false;
    }
  }