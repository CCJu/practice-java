import java.util.Random;

/**
 * 
 * @author mac1
 *自动生成n个整形的数字，要求去掉重复的，之后按照从大到小的顺序排序
 *	1.先排序，再去重
 *		排序好后，重复的数字会在一起，只需要判断该数字和它的前面是不是一样的，一样就控制不输出
 *  2.先去重，再排序
 *  	
 *  此例采用第二种	
 *  **建议采用第一种，当数组长度很大的时候，通过遍历数组去掉重复的数据很浪费时间**	
 */
public class test {
	//a数组用来存放一开始由随机生成的整形数组成的数组
	int a[]=null;
	//存放去重后的数组a，以及排好序后的数组b
	int b[]=null;
	public test(){
		Random ran=new Random();
		//随机生成数组的长度
		int n=ran.nextInt(20);
		a=new int[n];
		//为数组a赋值
		for(int i=0;i<n;i++)
			a[i]=ran.nextInt(50);
	}
	/**去重
	 * 遍历数组进行去重
	 * @param book
	 * @return
	 */
	public int[] delete(int book[]){
		int num=0;
		for(int i=0;i<book.length;i++){
			if(book[i]==-1)
				continue;
			for(int j=i+1;j<book.length;j++)
				if(book[j]==book[i]){
					book[j]=-1;
					num++;	
				}
		}
		b=new int[book.length-num];
		for(int i=0,j=0;i<b.length;j++){
			if(book[j]!=-1){
				b[i]=book[j];
				i++;
			}
		}
		return b;
	}
	/**对去重后的数组进行排序
	 * 采用了快速排序
	 * @param begin
	 * @param end
	 */
	public void sort(int begin,int end){
		if(begin>=end)
			return;
		int i=begin,j=end,t;
		int flag=b[begin];
		while(i!=j){
			while(i<j&&flag<=b[j])
				j--;
			while(i<j&&b[i]<=flag)
				i++;
			if(i<j){
				t=b[i];
				b[i]=b[j];
				b[j]=t;
			}
		}
		b[begin]=b[i];
		b[i]=flag;
		sort(i+1,end);
		sort(begin,i-1);
	}
	public static void main(String arg[]){
		test t=new test();
		t.b=t.delete(t.a);
		t.sort(0, t.b.length-1);
		System.out.println(t.b.length);
		for (int i : t.b) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(t.a.length);
		for (int i : t.a) {
			System.out.print(i+" ");
		}
	}
}
