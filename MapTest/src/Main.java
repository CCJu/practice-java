import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static Map<String,Course> stuMap=new HashMap<String,Course>();
	
	public static void add(){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;){
			System.out.println("请输入课程序号：");
			String num=input.next();
			Course cr=stuMap.get(num);
			if(cr==null){
				System.out.println("请输入课程名字：");
				String name=input.next();
				Course c=new Course(name);
				stuMap.put( num, c);
				i++;
			}
			else{
				System.out.println("该课程序号已经被占用！！！！");
				continue;
			}
		}
	}
	public static void show(){
		System.out.println("总共有 ："+stuMap.size());
		Set <String> keySet=stuMap.keySet();
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()){
			String c=it.next();
			Course c1=stuMap.get(c);
			System.out.println("课程："+c1.getName());
		}
	}
	public static void testRemove(){
		System.out.println("请输入要删除的课程序号：");
		Scanner in=new Scanner(System.in);
		String num=in.next();
		Course c=stuMap.get(num);
		if(c!=null)
			stuMap.remove(num);
		else System.out.println("该课程序号不存在！！！");
	}
	public static void show1(){
		Set <Course> s= new HashSet<Course>(stuMap.values());
		//Set <Course> s= (Set<Course>) stuMap.values();
		//转换错误只能从大向小转
		Iterator<Course> it=s.iterator();
		while(it.hasNext()){
			Course c1=it.next();
			System.out.println("课程："+c1.getName());
		}
	}
	public static void show2(){
		Set<Entry<String, Course>>entrySet=stuMap.entrySet();
		for(Entry<String,Course> e:entrySet){
			System.out.println("课程："+e.getValue().getName());

		}
	}
	public static void change(){
		while(true){
			System.out.println("请输入要修改的课程序");
			Scanner in=new Scanner(System.in);
			String s=in.next();
			if(stuMap.containsKey(s)){
				System.out.println("请输入修改后的课程名：");
				String s1=in.next();
				Course c=new Course(s1);
				stuMap.put(s, c);
				break;
			}
			else{
				System.out.println("不存在该课程序号！！！");
				continue;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		show();
		testRemove();
		//show1();
		change();
		show2();
	}

}
