import java.util.Scanner;
class Test1 {
  public static int algorithm(String[] names, String lookingFor)
{  
  int found = -1;
  for (int i = 0; i < names.length; i++)
  {
    if (lookingFor.equals(names[i]))
    {
      found = i;
      break;
    }
  }
  return found;
}
}