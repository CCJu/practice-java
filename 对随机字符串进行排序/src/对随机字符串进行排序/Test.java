package 对随机字符串进行排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Test {
	public List<String> strList=new ArrayList<String>();
	public void add(){
		Random random=new Random();
		int t=random.nextInt(10);
		for(int i=1;i<=t;){
			String str="";
			for(int n=1;n<=t;){
				char c=(char)random.nextInt();
				if((c<'z'&&c>'a')||(c>'0'&&c<'9')||(c>'A'&&c<'Z')) {str+=c; n++;}
			}
			if(!strList.contains(str)) {strList.add(str); i++;}
		}
		
	}
	public void show(){
		Iterator <String> it=strList.iterator();
		//java 8为迭代器新增的方法
		it.forEachRemaining(String ->System.out.println(String));
//		while(it.hasNext()){
//			String s=it.next();
//			System.out.println(s);
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.add();
		Collections.sort(t.strList);
		t.show();
		
	}

}
