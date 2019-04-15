package 对随机整数进行排序;
import java.util.*;
public class Main {
	static List<Integer> numList=new ArrayList<Integer>();
	public static void add(){
		int n;
		Random random=new Random();
		for(int i=0;i<10;i++){
			do{
				n=random.nextInt(100);
			}while(n<10);
			numList.add(n);
		}
	}
	public static void sort1(){
		for(int i=0;i<10;i++)
			for(int n=i+1;n<10;n++){
				int m;
				if(numList.get(n)<numList.get( i)){
					m=numList.get(i);
					numList.set(i,numList.get(n));
					numList.set(n, m);
				}
			}		
	}
	public static void sort2(){
		int q = 0,a;
		for(int i=0;i<10;i++){
			int min=numList.get(i);
			for(int n=i+1;n<10;n++)
				if(min>numList.get(n)) {min=numList.get(n);q=n;}
			a=numList.get(i);
			numList.set(i, numList.get(q));
			numList.set(q, a);
		}
	}
	public static void sort3(int []array){
		int index;
		for(int i=0;i<array.length-1;i++){
			index=i;
			for(int j=i;j<array.length;j++){
					if(array[j]>array[index])
						index=j;
			}
			int t=array[index];
			array[index]=array[i];
			array[i]=t;
		}
		for (int i : array) {
			System.out.print(i+" ");
		}	
	}
	public static void sort4(int []array){
		for(int i=0;i<array.length-1;i++)
			for(int j=0;j<array.length-i-1;j++)
				if(array[j]>array[j+1]){
					int t=array[j+1];
					array[j+1]=array[j];
					array[j]=t;
				}
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
	public static void show(){
		System.out.println("共有："+numList.size()+"个");
		for(Integer integer:numList){
			System.out.println(integer);
		}
	}
	public static void sort5(int []array){
		int index;
		for(int i=0;i<array.length;i++){
			index=0;
			for(int j=1;j<array.length-i;j++)
				if(array[j]<array[index])
					index=j;
			int temp=array[array.length-i-1];
			array[array.length-i-1]=array[index];
			array[index]=temp;
			System.out.println();
			for (int m : array) {
				System.out.print(m+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={45,232,65,23,5,7674,324,9,86,76,7,4};
		//Arrays.sort(a);
		//System.out.println();
		System.out.println("排序前：");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("************************************");
		sort5(a);
		
		//add();
		//Collections.sort(numList);
		//sort2();
		
		show();
	}

}
