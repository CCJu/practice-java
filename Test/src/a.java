
public class a<T>{
	
	private T a;
	a(T a){
		this.a=a;
	}
	public void get() {
		System.out.println(a.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a<String> aa=new a<>("sdsd");
		aa.get();
		a<Integer> aaa=new a<>(1);
		aaa.get();
		
	}


	

}
