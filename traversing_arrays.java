class TraversingArrays {
    public static void main(String[] args) {
      String names[] = {"Pranav","Diana","Sejal","Alex","Cedric"};
      int nums[] = {7,6,3,1,-1};
  
      
  
      for (int i : nums){
        System.out.println(i);
      }
      
      System.out.println("");
      
       for (String j : names){
        System.out.println(j);
      }
      
      System.out.println("");
  
      int a = 0;
  
  while (a < nums.length){
           System.out.print(nums[a] + " ");
           a++;
      }
  
      System.out.println("");
  
      int b = 0;
  
      while (b < names.length){
           System.out.print(names[b] + " ");
           b++;
      }
  
          System.out.println("");
          System.out.println("");
  
      for (int c = 0; c < nums.length; c++)
  {
      System.out.print(nums[c] + " ");
      
  }
  
          System.out.println("");
          System.out.println("");
  
      for (int d = 0; d < names.length; d++)
  {
      System.out.print(names[d] + " ");
      
  }
    }
  }