package stringBasics;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		String s2=s.substring(0, 2);
		int n=s.length();
		for(int i=0;i<n;i++) {
		System.out.print(s2);
		}
	}

}
