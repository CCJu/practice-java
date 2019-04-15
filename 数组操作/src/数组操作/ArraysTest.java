package 数组操作;
import java.util.Arrays;
public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={5,7,3,4,8,2};
		/*
		 * 调用Arrays类中对数组操作的方法
		 */
		
		
		/*
		 * void sort(type []a)对数组a进行排序
		 *void sort(type []a,int fromIndex,int toIndex)
		 */
		Arrays.sort(a);
		for(int n:a)System.out.print(n);
		
		
		/*
		 * int binarySearch(type []a,type key);使用二分法查询key元素，如果没有则返回负数					
		*int binarySearch(type []a,int fromIndex,int toIndex,type key);查询从fromIndex到toIndex，没有返回负数	******这两个方法必须先按升序排列才能使用
		*/
		System.out.println();
		int n=Arrays.binarySearch(a, 9);
		System.out.println(n);
		
		
		/*
		 * type []copyOf(type []original,int length);把original数组复制为一个新数组，length为长度，大于original数组的长度，超过的自动赋值为定义的类型的值
		 * ，小于则只赋值未超过的
		 * type []copyOfRange(type []original,int from,int to);复制from到to位置的元素
		 */
		int []b=Arrays.copyOf(a, 4);
		for(int p:b) System.out.print(p);
		int []c=Arrays.copyOf( a, 7);
		for(int p:c) System.out.print(p);
		
		
		/*
		 * boolean equals(type []a1,type []a2);比较数组a1，a2，长度，内容都相同返回true，反之false
		 */
		System.out.println();
		boolean p=Arrays.equals(b,c);
		System.out.println(p);
		
		
		/*
		 * void fill(type []a,type val);将数组a的所有元素复制为val
		 * void fill(type []a,int fromIndex,int toIndex,type val)
		 */
		Arrays.fill(b, 1);
		for(int p1:b)System.out.print(p1);
		
		
		/*
		 * String toString(type []a);将数组a转化为字符串
		 */
		String str=Arrays.toString(a);
		System.out.println(str);
		
		
		/*
		 * 
		 */
		
	}

}
