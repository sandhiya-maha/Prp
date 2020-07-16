package Serilizations;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s1=new Employee();
		Employee s2=new Employee();
		s1.setName("initha");
		s1.setDob("15/10/1999");
		s1.setDept("ece");
		s1.setDesgn("3");
		s1.setSalary(20000);
		s2.setName("vigashini");
		s2.setDob("27/07/2000");
		s2.setDept("ece");
		s2.setDesgn("5");
		s2.setSalary(50000);
	
		try
		{
			FileOutputStream f1 =new FileOutputStream("Fil1.txt");
			ObjectOutputStream f2=new ObjectOutputStream(f1);
			f2.writeObject(s1);
			f2.writeObject(s2);
			f2.flush();
			f2.close();
			f1.close();
			FileInputStream f3=new FileInputStream("Fil1.txt");
			ObjectInputStream o1=new ObjectInputStream(f3);
			Employee s3=(Employee) o1.readObject();
			System.out.println(s1+""+s2+""+s3+"");
		}
		catch(Exception e)
		{
			System.out.println(e);
	    }
	  }
	}



