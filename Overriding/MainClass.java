package Overriding;

public class MainClass {

	public static void main(String[] args) {
		Fruit a=new Apple();
		Fruit o=new Orange();
		a.setName("Apple");
		a.setTaste("Sweet");
		a.eat();
		o.setName("Mango");
		o.setTaste("sour");
		o.eat();

	}

}
