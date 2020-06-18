package classes;

public class Box {
	private int width;
	private int height;
	private int depth;
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int volume()
	{
		  return width*height*depth;
	}

	public static void main(String[] args) {
		Box b=new Box(10,20,30);
		System.out.println("Volume of the box is "+b.volume());
	}

}
