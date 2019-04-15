import java.io.File;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				File file=new File("files/hello");
				if(file.exists()){
					System.out.println("hello");
				}	
				else
					file.mkdir();
		
	}

}
