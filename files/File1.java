import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class File1 {
public static void main(String[] args) {
	try {
		FileReader in=new FileReader("f1.txt");
		int x=0;
		int count=0;
		System.out.println("Enter the character to be counted");
		Scanner sc=new Scanner(System.in);
		char c1=sc.next().charAt(0);
		
		while((x=in.read())!=-1)
		{
				if(x==c1)
				{
					count++;
				}
		}
		System.out.println(count);
	

	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
