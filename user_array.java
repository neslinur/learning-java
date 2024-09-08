import java.util.Scanner;
class UserArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many numbers do u want?");
    int num = scan.nextInt();

    int arr[] = new int[num];

    System.out.println("Give me the numbers.");
    
    for (int i = 0; i < arr.length; i++){
      arr[i] = scan.nextInt();
    }

    int sum = 0;

    for (int i = 0; i < arr.length; i++){
      sum+=arr[i];
    }

    System.out.println("Your sum is " + sum);

    System.out.println("Your max number is " + findMax(arr));
    System.out.println("Your min number is " + findMin(arr));


    int reverse[] = reverse(arr);

     for (int i = 0; i < reverse.length; i++)
       {
         System.out.println(reverse[i]);
       }
   
  }

  public static int findMax(int arr[]){
    int max = arr[0];
    for (int i = 1; i < arr.length; i++){
    if (arr[i] > max){
      max = arr[i];
    }   
    }
return max;
    
  }

    public static int findMin(int arr[]){
    int min = arr[0];
    for (int i = 1; i < arr.length; i++){
    if (arr[i] < min){
      min = arr[i];
    }   
    }
return min;
    
  }

  public static int[] reverse(int arr[]){
int reversearray[] = new int[arr.length];
    int a = 0;
     for (int i = arr.length - 1; i >= 0; i--){
      reversearray[a] = arr[i];
       a++;
    }
    return reversearray;
  }
}