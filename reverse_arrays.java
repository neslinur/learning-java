class ReverseArray {
    public static void main(String[] args) {
      int[] pink = new int[17];
      int[] reverse = new int[17];
      
      for (int i = 0; i < 17; i++){
        pink[i] = (int) (Math.random() * 100);
      }
  
      int a = 0;
      
      for (int i = 16; i >= 0; i--){
        reverse[a] = pink[i];
        a++;
      }
  
      for (int i = 0; i < 17; i++){
        System.out.println(pink[i]);
      }
  
      System.out.println("");
      
      for (int i = 0; i < 17; i++){
        System.out.println(reverse[i]);
      }
      
       
    }
  }