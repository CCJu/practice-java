/**
 * 对一列数进行解密
 * 解密规则：删除第一个数，将第二个数放在这一列数的末尾，得到一列新的数，再次进行以上步骤，直到删除最后一个数为止
 * @author mac1
 *
 */
public class test1 {
	static int a[]={6,3,1,7,5,8,9,2,4};
	public static void decryption(){
		int i=0;
		while(true){
			if(a[1]==-1){
				System.out.print(a[0]);
				return ;
			}
			System.out.print(move(a.length-1-i)+" ");
			i++;
		}
		
	}
	public static int move(int end){
		int i=0;
		int num=a[1];
		int ii=a[0];
		if(i+2<a.length)
			while(true){
				if(end==1) {a[0]=a[1];a[1]=-1;return ii;}
				a[i]=a[i+2];
				if(i+2==end){a[end-1]=num; a[end]=-1;  return ii;}
				i++;
			}
		else
			return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1.decryption();
	}

}
