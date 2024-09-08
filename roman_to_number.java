import java.util.Scanner;
class RomanToNumber {
  public static void main(String[] args) {
 //1 = I, 5 = V, 10 = X, 50 = L, 100 = C, 500 = D, 1000 = M
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a roman number from 1 to 3999.");
    String rom = scan.nextLine();
System.out.println(RomanRvs(rom));
  }
public static Integer RomanRvs(String rom) {

int output = 0;
  int a = 0;
int len = rom.length();
int b = 0;
for (int i = 0; i < len; i++)
{
  if (rom.indexOf('M') == 0)
{
  output+=1000;
  rom = rom.substring(1,rom.length());
}
else if (rom.indexOf('C')==0 && rom.indexOf('M')==1)
{
  output+=900;
  rom = rom.substring(2,rom.length());
}
else if (rom.indexOf('D') == 0)
{
  output+=500;
  rom = rom.substring(1,rom.length());
}
else if (rom.indexOf('C')==0 && rom.indexOf('D')==1)
{
  output+=400;
  rom = rom.substring(2,rom.length());
}
else if (rom.indexOf('C') == 0)
{
  output+=100;
  rom = rom.substring(1,rom.length());
}
else if (rom.indexOf('X')==0 && rom.indexOf('C')==1)
{
  output+=90;
  rom = rom.substring(2,rom.length());
}
else if (rom.indexOf('L') == 0)
{
  output+=50;
  rom = rom.substring(1,rom.length());
}
else if (rom.indexOf('X')==0 && rom.indexOf('L')==1)
{
  output+=40;
  rom = rom.substring(2,rom.length());
}
  else if (rom.indexOf('X') == 0)
{
  output+=10;
  rom = rom.substring(1,rom.length());
}
else if (rom.indexOf('I')==0 && rom.indexOf('X')==1)
{
  output+=9;
  rom = rom.substring(2,rom.length());
}
else if (rom.indexOf('V') == 0)
{
  output+=5;
  rom = rom.substring(1,rom.length());
}
else if (rom.indexOf('I')==0 && rom.indexOf('V')==1)
{
  output+=4;
  rom = rom.substring(2,rom.length());
}
  else if (rom.indexOf('I') == 0)
{
  output+=1;
  rom = rom.substring(1,rom.length());
}
}
  return output;

  
}
}