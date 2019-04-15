import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String s="2016-09-03";
		try {
			sdf.parse(s);
			System.out.println("6666");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("出现异常了？！！");
		}
	}

}
