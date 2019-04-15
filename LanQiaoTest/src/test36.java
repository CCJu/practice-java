import java.util.Scanner;

public class test36 {
	
	public void getResult(StringBuffer s[]){
		int num[];
		for(int i=0;i<s.length;i++){
			num=new int[26];
			for(int j=0;j<s[i].length();j++)
				num[s[i].charAt(j)-'a']++;
			int max=0;
			for(int k=0;k<26;k++){
				if(num[k]>num[max]) max=k;
			}
			System.out.println((char)('a'+max)+" "+num[max]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		StringBuffer s[]=new StringBuffer[n];
		for(int i=0;i<n;i++){
			s[i]=new StringBuffer(in.next());
		}
		new test36().getResult(s);
	}

}
