import java.util.Random;

public class QuickSort {
	int []n;
	public QuickSort(){
		n=new int[10];
	}
//	public void sort(int begin,int end){
//		if(begin>=end)
//			return;
//		int i=begin,j=end,t;
//		int flag=n[begin];
//		while(i!=j){
//			while(i<j&&flag<=n[j])
//				j--;
//			while(i<j&&n[i]<=flag)
//				i++;
//			if(i<j){
//				t=n[i];
//				n[i]=n[j];
//				n[j]=t;
//			}
//		}
//		n[begin]=n[i];
//		n[i]=flag;
//		sort(i+1,end);
//		sort(begin,i-1);
//
//	}
	public void sort(int begin,int end){
		if(begin>=end)
			return ;
		int flag=n[begin];
		int i=begin,j=end,t;
		while(i!=j){
			while(i<j){
				if(n[j]<flag)
					break;
				j--;	
			}
			while(i<j){
				if(n[i]>flag)
					break;
				i++;
			}
			//if(i<j){
			t=n[i];
			n[i]=n[j];
			n[j]=t;
			//}
		}
		n[begin]=n[i];
		n[i]=flag;
		sort(begin,i-1);
		sort(i+1,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort qs=new QuickSort();
		int []a=qs.n;
		Random random=new Random();
		for(int i=0;i<a.length;){
			int num=random.nextInt(10);
			boolean m=false;
			for(int n=0;n<i;n++){
				if(a[n]==num)
					m=true;
			}
			if(!m){
				a[i]=num;
				i++;
			}
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
		qs.sort(0,9);
		System.out.println();
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}
