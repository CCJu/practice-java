
public class Rabbit extends Paint implements AsciiArt {
	
	public void gAuthor(){
		System.out.println("作者："+getAuthor());
	}
	public void gName(){
		setName("小兔子");
		System.out.println("作品名中："+getName());
	}
	public void draw(){										
		gAuthor();
		gName();
		System.out.println("---------------------------------");
		System.out.println("/)/)");
		System.out.println("(--) )o");
		System.out.println("|| ||");
		
	}
}
