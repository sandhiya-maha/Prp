package Polymorphism;

public class MainClass {
	public static void main(String args[]) {
	Shape c=new Circle();
	Shape t=new Triangle();
	Shape s=new Square();
	System.out.println("Methods of Circle");
	c.draw();
	c.erase();
	System.out.println("Methods of Triangle");
	t.draw();
	t.erase();
	System.out.println("Methods of Square");
	s.draw();
	s.erase();
	}
}
