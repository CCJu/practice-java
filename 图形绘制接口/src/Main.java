import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您的大名!!");
		String name=input.next();
		System.out.println("1.圆形");
		System.out.println("2.矩形");
		System.out.println("3.小兔子");
		System.out.println("请输入序号来完成相关操作");
		int i=input.nextInt();
		Paint p0;
		if(i==1){										
			p0=new Circle();
			p0.setAuthor(name);
			System.out.println("请输入圆的半径");
			double r=input.nextDouble();
			 ((Circle) p0).setR((int)r);
			p0.draw();
		}else if(i==2){									
			p0=new Rectangle();
			p0.setAuthor(name);
			System.out.println("请输入矩形的长和宽");
			double length=input.nextDouble();
			double width=input.nextDouble();
			((Rectangle) p0).setLength((int)length);
			((Rectangle) p0).setWidth((int)width);
			p0.draw();
		}else if(i==3){									
			p0=new Rabbit();
			p0.setAuthor(name);
			p0.draw();
		}else System.out.println("输入错误！！！");
		input.close();
	}

}
