public class Flow1B{
public static void main(String args[]){
	int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);
	int num1=n1%10;
	int num2=n2%10;
	boolean flag=false;
	if(num1==num2)
		{
			flag=true;
			System.out.println(flag);
		}
	else
		{
			System.out.println(flag);
		}
	}
}