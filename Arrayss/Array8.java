public class Array8
{
  public static void main(String[] args)
  {
    int[] arr=new int[args.length];
   int sum=0;
   int check6=0;
   int check7=0;
    for(int i=0;i<args.length;i++)
     {
       arr[i]=Integer.parseInt(args[i]);
       if(arr[i]==6)
       check6=i;   
       if(arr[i]==7)
       check7=i;
     } 
   if(check7>check6)
   {
    for(int i=0;i<arr.length;i++)
     {
      if(i<check6 || i>check7)
       sum=sum+arr[i];
     }
   }
 else
 {
  for(int i=0;i<arr.length;i++)
    sum=sum+arr[i];
  }
System.out.println(sum);
}
}
