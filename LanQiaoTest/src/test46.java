import java.util.Scanner;

public class test46 {
	StringBuffer s=new StringBuffer();
	public void getNumBinaryArray(int n){
		int i=0;
		int num[]=new int[20];
		while(n>0){
			num[i]=n%2;
			n/=2;
			i++;
		}
		for(int j=i;j>=0;j--){
			if(num[j]==1&&j>2) {
				s.append("2(");
				getNumBinaryArray(j);
				s.append(")+");
			}
			if(num[j]==1&&j==2)
				s.append("2(2)+");
			if(num[j]==1&&j==1)
				s.append("2+");
			if(num[j]==1&&j==0)
				s.append("2(0)+");
		}
		
	}
	
	public void getResult(){
		int length=s.length();
		for(int i=0;i<length;i++)
			if(s.charAt(i)=='+')
				if(s.charAt(i+1)==')'){
					s.deleteCharAt(i);length--;
				}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		test46 t=new test46();t.getNumBinaryArray(n);
		t.s.deleteCharAt(t.s.length()-1);
		t.getResult();
		System.out.println(t.s);
		in.close();
	}

}
