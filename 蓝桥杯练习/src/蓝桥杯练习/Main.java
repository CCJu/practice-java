package 蓝桥杯练习;

public class Main {
	public static void main(String args[]){
		for(int n=16;n<472;n++){
			for(int k=1;k<n;k++){
				if((n+k+1)*(n-k)==472)
					System.out.println("n"+n+" ,k"+k);
			}
		}
	}
}
