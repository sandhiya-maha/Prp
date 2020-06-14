public class Flow1A{
	public static void main(String args[])
		{
		  int number1=Integer.parseInt(args[0]);
		  if(number1<0)
			{
				System.out.println("Negative");
			}
		 else if(number1>0)
			{
				System.out.println("Positive");
			}
		 else 
			{
			System.out.println("Zero");
			}
		}
}