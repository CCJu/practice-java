import java.util.Random;
public class test32 {

	/**
	 * 
	 * @param i 开始的横坐标
	 * @param j 开始的纵坐标
	 * @param direction 1表示向下 2表示向右 3表示向上 4表示向左
	 */
	public void result(int i,int j,int direction,int num[][],int m,int n){
		
		if(direction==1){	
			if(i+1==m||num[i+1][j]==-1){
				if(j+1==n||num[i][j+1]==-1)
					return;
				else
					result(i, j, 2, num, m, n);
			}else{
				int begin=i;
				while(i<m){
					if(num[i][j]!=-1){
						System.out.print(num[i][j]+" ");
						num[i][j]=-1;
					}else{
						if(begin!=i)
							break;
					}
					i++;
				}
				result(i-1, j, 2, num, m, n);
			}	
		}
		if(direction==2){
			if(j+1==n||num[i][j+1]==-1){
				if(i-1<0||num[i-1][j]==-1)
					return;
				else
					result(i, j, 3, num, m, n);
			}else{
				int begin=j;
				while(j<n){
					if(num[i][j]!=-1){
						System.out.print(num[i][j]+" ");
						num[i][j]=-1;
					}else{
						if(begin!=j)
							break;
					}
					j++;
				}
				result(i, j-1, 3, num, m, n);
			}
		}
		if(direction==3){
			if(i-1<0||num[i-1][j]==-1){
				if(j-1<0||num[i][j-1]==-1)
					return;
				else
					result(i, j, 4, num, m, n);
			}else{
				int begin=i;
				while(i>=0){
					if(num[i][j]!=-1){
						System.out.print(num[i][j]+" ");
						num[i][j]=-1;
					}else{
						if(begin!=i)
							break;
					}
					i--;
				}
				result(i+1, j, 4, num, m, n);
			}
			
				
		} 
		if(direction==4){
			if(j-1<0||num[i][j-1]==-1){
				if(i+1==m||num[i+1][j]==-1)
					return ;
				else
					result(i, j, 1, num, m, n);
			}else{
				int begin=j;
				while(j>=0){
					if(num[i][j]!=-1){
						System.out.print(num[i][j]+" ");
						num[i][j]=-1;					
					}else{
						if(begin!=j)
							break;
					}
					j--;	
				}
				result(i, j+1, 1, num, m, n);
			}		
		}
	}
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		long begin=System.currentTimeMillis();
		Random random=new Random();
		int m=0,n=0;
		while(m==0||n==0){
			m=random.nextInt(200);
			n=random.nextInt(200);
		}
		int num[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				num[i][j]=random.nextInt(10);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				System.out.print(num[i][j]+" ");
			System.out.println();
		}
		
		new test32().result(0, 0, 1, num, m, n);
		long end=System.currentTimeMillis();
		System.out.println();
		System.out.println(end-begin+"ms");
	}

}
