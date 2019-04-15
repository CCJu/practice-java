import graph.Drawable;
import graph.Eraseable;

public class Circle extends Shape implements Drawable,Eraseable{
	private double r;
	Circle(double r)
	{
		this.r=r;
	}
	public double getArea()
	{
		return Math.PI*r*r;
	}
	public void draw()
	{
		System.out.println("Draw a circle.  radius="+r);
	}
	public void erase()
	{
		System.out.println("Erase a circle.  radius="+r);
	}
}
