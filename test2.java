import java.util.ArrayList;
class Test2 {
  public static void main(String[] args) {
    ArrayList<Integer> poo = new ArrayList<Integer>();
    poo.add(5);
    poo.add(2);
    poo.add(4);
    poo.add(1);
    poo.add(3);
    poo.add(6);

    insertionSort(poo);

    for (Integer a : poo)
    System.out.println(a);
  }
public static void insertionSort(ArrayList<Integer> data)

{

for (int j = 1; j < 5; j++)

{

int v = data.get(j);

int k = j;

while (k > 0 && v < data.get(k - 1))

{

data.set(k, data.get(k - 1)); /* Statement 1 */

k--;

}

data.set(k, v); /* Statement 2 */

/* End of outer loop */

}

}

}