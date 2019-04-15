
public class test17 {
//	public String getNum(){
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<32;i++){
			StringBuffer s=new StringBuffer(Integer.toBinaryString(i));
			int length=s.length();
			if(length==1)
				s.insert(0, "0000");
			else if(length==2)
				s.insert(0, "000");
			else if(length==3)
				s.insert(0, "00");
			else if(length==4)
				s.insert(0, '0');
			System.out.println(s);
		}
	}

}
