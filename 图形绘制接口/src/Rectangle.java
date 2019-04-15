
public class Rectangle extends Paint implements AsciiArt {
	private int length,width;
	public void gAuthor(){
		System.out.println("作者："+getAuthor());
	}
	public void gName(){
		setName("矩形");
		System.out.println("作品名："+getName());
	}
	public void draw(){													
		gAuthor();
		gName();
		System.out.println("---------------------------");
		for(int i=1;i<=width;i++){
			for(int n=1;n<=length;n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
}
