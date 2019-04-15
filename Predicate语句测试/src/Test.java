import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static int num(List<String> str,Predicate<List<String>> p){
		int n=0;
		for(String s:str){
			if(p.test(str)) n++;
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []str={"轻量级java EE企业应用实战","疯狂java讲义","疯狂","疯狂Windows讲义","疯狂 IOs开发"};
		List <String> strList=new ArrayList();
		strList.addAll(Arrays.asList(str));
		System.out.println(num(strList,String->String.contains("java")));
	}

}
