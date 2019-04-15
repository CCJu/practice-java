import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=1;
		for(;a==1;){
			System.out.println("1.Circle .  2.Rectangle.");
			System.out.print("请输入序号来完成面积的计算.  :");
			int a1=input.nextInt();
			if(a1==1) {
				System.out.print("请输入半径：");
				double r=input.nextDouble();
				Circle p0=new Circle(r);
				p0.draw();
				System.out.println(p0.getArea());
				p0.erase();
			}
			else if(a1==2){
				System.out.print("请输入长：");
				double length=input.nextDouble();
				System.out.print("请输入宽：");
				double width=input.nextDouble();
				Rectangle p0=new Rectangle(length,width);
				p0.draw();
				System.out.println(p0.getArea());
				p0.erase();
			}
			System.out.print("输入1表示继续进行圆和矩形的面积计算，输入0表示结束：");
			a=input.nextInt();
		}
		input.close();
	}

}
