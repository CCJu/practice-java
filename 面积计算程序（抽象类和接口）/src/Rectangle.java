import graph.Drawable;
import graph.Eraseable;

public class Rectangle extends Shape implements Drawable,Eraseable{
	private double a;
	private double b;
	Rectangle(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public double getArea()
	{
		return a*b;
	}
	public void draw()
	{
		System.out.println("Draw a Rectangle.  length="+a+"width"+b);
	}
	public void erase()
	{
		System.out.println("Erase a Rectangle.  length="+a+"width"+b);
	}
}
