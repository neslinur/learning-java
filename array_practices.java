class ArrayPractices {
    public static void main(String[] args) {
      String names[] = {"Alex", "Neslinur", "Kaya", "Hamide", "Ahmet", "Ahsen", "Mia"};
  
      int length[] = new int[7];
  
      int newlength[] = new int[7];
  
      int collat[] = new int[7];
  
      int r2[] = new int[7];
  
      int reverse[] = new int[7];
      
      for (int i = 0; i < 7; i++){
        length[i] = names[i].length();
      }
  
      for (int i = 0; i < 7; i++){
        System.out.println(names[i]);
      }
  
        System.out.println("");
  
      for (int i = 0; i < 7; i++){
        System.out.println(length[i]);
      }
  
        System.out.println("");
  
      for (int i = 0; i < 7; i++){
        newlength[i] = length[i]+2;
      }
  
      System.out.println("");
  
        for (int i = 0; i < 7; i++){
        System.out.println(newlength[i]);
      }
  
        System.out.println("");
  
         for (int i = 0; i < 7; i++){
           if (newlength[i] % 2 == 0){
             collat[i] = newlength[i]/2;
           }
           else {
             collat[i] = (newlength[i]*3)+1;
           }
         }
  
        for (int i = 0; i < 7; i++){
        System.out.println(collat[i]);
      }
  
      System.out.println("");
      
     System.out.println(sum(collat));
  
      System.out.println("");
  
      for (int i = 0; i < 7; i++){
       r2[i]=collat[(i+2)%collat.length];
      }
      
       for (int i = 0; i < 7; i++){
        System.out.println(r2[i]);
      }
  
      System.out.println("");
  
      int a = 0;
      for (int i = 6; i >= 0; i--){
       reverse[a] = r2[i];
       a++;
      }
  
      for (int i = 0; i < 7; i++){
        System.out.println(reverse[i]);
      }
  
      System.out.println("");
  
  
      
    }
    //another class
        public static int sum(int arr[]){
        
      int sum = 0;
        
      for (int i = 0; i < 7; i++){
        sum += arr[i];
      }
        return sum;
      }
  
   
  
    
  }