package hhh;

public class arithmetic {
	private double a;
	private double b;
	public String getResult(String s){
		double result = 0;
		if(s.equals("+"))
			result=a+b;
		else if(s.equals("-"))
			result=a-b;
		else if(s.equals("*"))
			result=a*b;
		else if(s.equals("/"))
			result=a/b;
		return result+"";
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
}
