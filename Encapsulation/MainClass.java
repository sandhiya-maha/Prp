package Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Book b=new Book("shakespeare","abc@gmail.com",'M',"Fairy Tale",500.50,4);
System.out.println("Author name: "+b.getName()+ "\nEmail: "+b.getEmail()+"\nGender: "+b.getGender()+"\nBook name: "+b.getBookName()+"\nPrice: "+b.getPrice()+"\nQuantity: "+b.getQtyInStock());
		
	}

}
