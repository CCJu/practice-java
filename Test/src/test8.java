
public class test8 {

	public void hello(int i){
		int t=i;
		if(i<20){
			System.out.println(i);
			hello(i+1);
		}
		if(i<=2){
			System.out.println("hello "+"i="+i+"  t="+t);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test8().hello(0);
	}

}
