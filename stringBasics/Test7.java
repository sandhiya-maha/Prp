package stringBasics;
import java.util.Scanner;
public class Test7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s1=sc.next();
	int n=s1.length();
	if((s1.startsWith("x"))&& (s1.endsWith("x")))
	{
		System.out.println(s1.substring(1,n-1));
	}
	else {
		System.out.println(s1);
	}
}
}
