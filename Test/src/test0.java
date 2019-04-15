
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class test0{
	public static void main(String[] args) {
		String date_string="201609";
		//	利用java中的SimpleDateFormat类，指定日期格式，注意yyyy,MM大小写
		//	这里的日期格式要求javaAPI中有详细的描述，不清楚的话可以下载相关API查看
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM");

		//SimpleDateFormat format=new SimpleDateFormat("yyyyMM");
		// 设置日期转化成功标识
		boolean dateflag=true;
		// 这里要捕获一下异常信息
		try
		{
			format.parse(date_string);
		} catch (ParseException e)
		{
			dateflag=false;
		}finally{
			//	成功：true ;失败:false
			System.out.println("日期是否满足要求"+dateflag);
		}
	}
}