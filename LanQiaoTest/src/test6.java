import java.util.Scanner;

public class test6 {
	
	public static int getInt(char c){
		if(c=='0')
			return 0;
		else
			return 1;

	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s1;
		for (int j=0;j<n;j++) {
			s1=in.next();
			StringBuffer s=new StringBuffer();
			for(int i=0;i<s1.length();i++){
				char c=s1.charAt(i);
				switch(c){
					case '0':s.append("0000");break;
					case '1':s.append("0001");break;
					case '2':s.append("0010");break;
					case '3':s.append("0011");break;
					case '4':s.append("0100");break;
					case '5':s.append("0101");break;
					case '6':s.append("0110");break;
					case '7':s.append("0111");break;
					case '8':s.append("1000");break;
					case '9':s.append("1001");break;
					case 'A':s.append("1010");break;
					case 'B':s.append("1011");break;
					case 'C':s.append("1100");break;
					case 'D':s.append("1101");break;
					case 'E':s.append("1110");break;
					case 'F':s.append("1111");break;
				}
			}
			s1=s.toString();
			int i=0;
			n=s1.length()%3;
			if(n==1){
				if(s1.charAt(0)!='0')
					s1="00"+s1;
				else
					s1=s1.substring(1);
			}
			else if(n==2){
				if(s1.charAt(0)!='0'||s1.charAt(1)!='0')
					s1="0"+s1;
				else
					s1=s1.substring(2);
			}
			for(int index=0;index<s1.length();index+=3){
				
				i=test6.getInt(s1.charAt(index))*4+test6.getInt(s1.charAt(index+1))*2+test6.getInt(s1.charAt(index+2));
				System.out.print(i);
			}
			System.out.println();
		}
		in.close();
	}
}
