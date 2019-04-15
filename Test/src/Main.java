
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int [10];
		int i=0;
		System.out.println("随机生成10个数");
		while(true){
			a[i]=(int) (Math.random()*10+1);
			i++;
			if(i==10) break;
		}
		System.out.println("生成的数为");
		for (int b : a) {
			System.out.print(b+" ");
		}
		System.out.println("排序后");
		for(int i0=1;i0<a.length;i0++){
			for(int j=i0;j>0;j--){
				if(a[j]<a[j-1]){
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					System.out.println();
					for (int k : a) {
						System.out.print(k+" ");
					}
				}else
					break;
			}
		}
		System.out.println();
		for (int i0 : a) {
			System.out.print(i0+" ");
		}
	}
	
}
