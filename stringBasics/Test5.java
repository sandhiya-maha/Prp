package stringBasics;
import java.util.Scanner;
public class Test5 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		int n=s1.length();
		System.out.println(s1.substring(1, n-1));
		}

}
