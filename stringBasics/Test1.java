package stringBasics;
import java.util.Scanner;
public class Test1 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		String s2=sb.reverse().toString();
		if(s1.equals(s2))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
