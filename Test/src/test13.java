
public class test13 {
	public void add(int a[],int b[]){
		for(int i=0;i<3;i++)
			a[i]=a[i]+b[i];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3};
		int b[]={1,2,3};
		new test13().add(a, b);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}
