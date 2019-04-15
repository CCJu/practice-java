
public class Main {

	public static void show(char a[]){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []src={'N','Q','T','A','J','O','F','A','F'};
		char []dist=new char[src.length];
		System.out.println("简单位移密码");
		for(int i=0;i<src.length;i++){
			if(src[i]-'A'>=5) dist[i]=(char) (src[i]-5);
			else dist[i]=(char)('Z'-4+src[i]-'A');
		}
		show(dist);
	}

}
