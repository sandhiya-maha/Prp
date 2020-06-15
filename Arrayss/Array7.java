import java.util.*;
public class Array7
{
  public static void main(String[] args)
  {
   int[] arr=new int[args.length];
   LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
   for(int i=0;i<args.length;i++)
   {
     arr[i]=Integer.parseInt(args[i]);
     l.add(arr[i]);
    }
  for(Integer x:l)
  {
    System.out.print(x+" ");
  }
}
}