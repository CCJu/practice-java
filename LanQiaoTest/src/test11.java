
public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
			for(int m=0;m<=9;m++)
				for(int n=0;n<=9;n++){
					if((i*100+m*10+n)==i*i*i+m*m*m+n*n*n)
						System.out.println(""+i+m+n);
				}
						
	}

}
