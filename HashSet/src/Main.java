import java.util.HashSet;
import java.util.Iterator;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []str={"teacher","student","teacher","java","hello","world"};
		HashSet <String> s=new HashSet<String>();
		for(String p:str)
			if(!s.add(p))
				System.out.println("检测到重复的单词："+p);
		System.out.println("共有不重复单词："+s.size());
		Iterator <String> it= s.iterator();
		while(it.hasNext()){
			String str1= it.next();
			System.out.println(str1);
		}
		
	}

}
