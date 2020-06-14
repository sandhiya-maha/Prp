public class Flow5{
public static void main(String args[])
{
 //char ch='a';
char ch=args[0].charAt(0);
 if((ch>=65 && ch<=90) ||(ch>=97 &&ch<=122))
 {
  System.out.println("Alphabet");
 }
else if(ch>=46 && ch<=57)
{
System.out.println("Digits");
}
else 
{
System.out.println("Special Characters");
}
}
}