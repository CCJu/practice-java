package hello;

public class Circle {
	private int r;
	public Circle(){
		r=1;
	}
	public double getArea(){
		return Math.PI*r*r;
	}
	public double getLength(){
		return Math.PI*2*r;
	}
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
}
