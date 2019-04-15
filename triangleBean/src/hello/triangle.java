package hello;

public class triangle {
	private double a,b,c;
	private boolean isTri;
	public triangle() {
		// TODO Auto-generated constructor stub
		a=0;
		b=0;
		c=0;
		isTri=false;
	}
	public double getArea(){
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public boolean isTriangle(){
		if((a+b>c)&&(b+c>a)&&(a+c>b)) return true;
		else return false;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public boolean isTri() {
		return isTri;
	}
	public void setTri(boolean isTri) {
		this.isTri = isTri;
	}
	
}
