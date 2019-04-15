import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m,n;
		n=in.nextInt();
		m=in.nextInt();
		StringBuffer s=new StringBuffer();
		for(int i=0;i<m;i++){
			s.append((char)('A'+i));
		}
		for(int i=0;i<n;i++){
			if(i!=0){
				s.insert(0, (char)('A'+i));
				System.out.println(s.deleteCharAt(m));
			}
			else
				System.out.println(s);
		}
		in.close();
	}

}
