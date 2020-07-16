import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Files2 {
	public static void main(String[] args) {
			try 
			{
			FileInputStream f=new FileInputStream("F2in.txt");
			FileOutputStream sc=new FileOutputStream("F2out.txt");
			int x=0;
			while((x=f.read())!=-1)
			{
				sc.write(x);
			}
			f.close();
			sc.close();
			FileInputStream f2=new FileInputStream("F2in.txt");
			while((x=f2.read())!=-1)
			{
				System.out.print((char)x);	
			}
			f2.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

  }
}
