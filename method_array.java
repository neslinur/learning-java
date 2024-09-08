class MethodArray {
    public static void main(String[] args) {
  int a[] = {1,2,3,4,5};
  
      for (int b : a){
        System.out.println(b);
      }
  
      System.out.println("");
      
      int increase [] = increase1(a);
      
      for (int b : increase){
        System.out.println(b);
      }
  
      System.out.println("");
  
       int reverse[]  = reverse(a);
  
      for (int c : reverse){
        System.out.println(c);
      }
  
      System.out.println("");
      
      int delete[]=delete(a,3);
  
      for (int d : delete){
        System.out.println(d);
      }
      
      System.out.println("");
      
      int insert[]=insert(a,2,5);
  
      for (int e : insert){
        System.out.println(e);
      }
      
      
    }
    public static int[] x(int a, int b, int c){
        int x[]= new int[3];
  
        x[0]=a;
        x[1]=b;
        x[2]=c;
  
        return x;
      }
  
    public static int[] y(){
  
      int a = 3;
      int b = 4;
      int c = 5;
  
        return new int[] {a,b,c};
      }
  
     public static double[] z(){
  
      double z[] = {7,6,-5,4};
  
        return z;
      } 
  
    public static int[] increase1(int a[]){
      for (int i = 0; i< a.length; i++){
        a[i]+=(i+1);
      }
  
      return a;
      
    }
  
    public static int[] reverse(int a[]){
      int c []= new int[a.length];
      int b = 0;
  
      for (int i = a.length -1; 0 <= i; i--){
        c[b] = a[i];
        b++;
      }
  
      return c;
    }
  
    public static int[] delete(int a[],int b){
  
      for (int i = b-1; i< a.length-1; i++){
        a[i]=a[i+1];
      }
  
      return a;
      
    }
  
    public static int[] insert(int a[],int pos, int val){
  
      for (int i = a.length-1; i>= pos; i--){
        a[i]=a[i-1];
      }
  
        a[pos-1]=val;
  
      return a;
      
    }
  
    
  }