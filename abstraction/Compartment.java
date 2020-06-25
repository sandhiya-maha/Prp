package abstraction;

abstract public class Compartment {
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice()
	{
	     return "FirstClass";

	}
}
class Ladies extends Compartment{
	public String notice() 
	{
		return "ladies";
	}
	
}
class General extends Compartment{
	public String notice() 
	{
		return "General";
	}
}
class Luggage extends Compartment{

	public String notice() 
	{
			return "Luggage";
	}
		
}
