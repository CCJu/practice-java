package ruanko.com;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book();								//对book类进行实例化
		book1.setAuthor("Bob");
		book1.setName("Think in Java");
		book1.setPrice(300);
		book1.setTime("2005-01-01");
		Book book2=new Book();
		book2.setAuthor("Tom");
		book2.setName("Effective Java");
		book2.setPrice(200);
		book2.setTime("2005-01-01");
		Book book3=new Book();
		book3.setAuthor("Ann");
		book3.setName("Effective Java");
		book3.setPrice(100);
		book3.setTime("2005-01-01");
		Book book4=new Book();
		book4.setAuthor("Mike");
		book4.setName("Effective Java");
		book4.setPrice(400);
		book4.setTime("2005-01-01");
		Book book5=new Book();
		book5.setAuthor("Jean");
		book5.setName("Effective Java");
		book5.setPrice(40);
		book5.setTime("2005-01-01");
		List<Book>list=new ArrayList<Book>();					//创建列表用来存放book类的对象
		list.add(book1);										//向列表中添加元素
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		for(int i=0;i<list.size();i++){			//对列表元素进行排序
			Book tmp;
			for(int j=i;j<list.size();j++){
				if(list.get(j).getPrice()>list.get(i).getPrice()) {
					tmp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,tmp);
				}
			}
		}
		for(Book b:list){
			System.out.println("name:"+b.getName()+"   author:"+b.getAuthor()+"   time:"+b.getTime()+"   price:"+b.getPrice());
		}
	}

	
}
