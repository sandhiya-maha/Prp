package classes;
import java.math.*;
public class Calculator {
	public static int powerInt(int num1,int num2)
	{
		return  (int)(Math.pow(num1, num2));
	}
	public static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1, num2);
	}
	public static void main(String args[])
	{
		//Calculator c=new Calculator();
		//c.powerDouble(12.50, 90.90);
		System.out.println("Integer "+Calculator.powerInt(12, 29));
		System.out.println("Double "+Calculator.powerDouble(2.5, 3.5));
	}
}
