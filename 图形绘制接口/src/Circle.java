
public class Circle extends Paint implements AsciiArt {
	private int r;
	public void gAuthor(){
		System.out.println("作者："+getAuthor());
	}
	public void gName(){
		setName("圆形");
		System.out.println("作品名："+getName());
	}
	public void draw(){												
		gAuthor();
		gName();
		System.out.println("---------------------------");
		for(int i=0;i<=2*r;i++){									
			for(int n=0;n<=2*r;n++){
				if(Math.sqrt((i-r)*(i-r)+(n-r)*(n-r))<=r) {System.out.print("**");}
				else {System.out.print("  ");}
			}
			System.out.println("");
		}
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
}
