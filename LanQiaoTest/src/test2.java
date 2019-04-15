/**
 * 接竹竿
 * @author mac1
 *
 */
public class test2 {
	int a[]={2,4,1,2,5,6,0,0,0,0,0,0};
	int b[]={3,1,3,5,6,4,0,0,0,0,0,0};
	int table[]={0,0,0,0,0,0,0,0,0,0,0,0};
	public String start(){
		String s=null;
		while(true){
			//System.out.println("hello ");
			s=hasWinner();
			if(s!=null)
				return s;
			out(a);
			out(b);
		}
	}
	public String hasWinner(){
		String winner=null;
		if(a[0]==0) winner="xiaoha";
		if(b[0]==0) winner="xiaoheng";
		if(winner==null)return null;
		else return winner;
	}
	public int exist(int card){
		for(int i=0;i<table.length;i++)
			if(table[i]==card)
				return i;
		return -1;	
	}
	public int indexTableIsNull(){
		for(int i=0;i<table.length;i++)
			if(table[i]==0) return i;
		return -1;
	}
	public void out(int player[]){
		int t=player[0];
		int i=0;
		while(i+1<player.length){
			player[i]=player[i+1];
			i++;
		}
		int card[]=getCard(t);
		if(card!=null){
			int index=indexPlayerNull(player);
			for(int a=0;a<card.length;a++)
				player[index+a]=card[a];
		}else
			table[indexTableIsNull()]=t;
			
	}
	public int indexPlayerNull(int player[]){
		for(int i=0;i<player.length;i++)
			if(player[i]==0)
				return i;
		return -1;
	}
	public int[] getCard(int card){
		int ca[]=null;
		if(exist(card)!=-1){
			int begin=exist(card),end;
			if(indexTableIsNull()!=-1)
				end=indexTableIsNull();
			else
				end=table.length;
			ca=new int[end-1-begin];
			for(int i=0,b=begin;i<ca.length;i++,b++){
				ca[i]=table[b];
				table[b]=0;
			}
		}
		return ca;
	}
	public void show(){
		System.out.println("result:");
		System.out.print("a: ");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("b: ");
		for (int i : b) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("table: ");
		for (int i : table) {
			System.out.print(i+" ");
		}
	}
	public static void main(String args[]){
		test2 t2=new test2();
		System.out.println(t2.start());
	}
}
