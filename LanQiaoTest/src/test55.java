import java.util.Scanner;  
  
public class test55 {  
  
    private static int result = 0;  
      
  
    public static boolean isSafety(short[][] chess, int row, int x, int queen) {  
          
        if (row != 0 && x != 0 && x != chess.length - 1) {  
              
            int step=1,step2=1;  
            while(row-step>=0&&x+step<=chess.length-1){  
                if(chess[row-step][x+step]==queen){  
                    return false;     
                }  
                step++;  
            }  
            while(row-step2>=0&&x-step2>=0){  
                if(chess[row-step2][x-step2]==queen){  
                    return false;     
                }  
                step2++;  
            }  
        }  
      
        if (row != 0 && x == 0) {  
            int step=1;  
            while(row-step>=0&&x+step<=chess.length-1){  
                if(chess[row-step][x+step]==queen){  
                    return false;     
                }  
                step++;  
            }  
        }  
  
        if (row != 0 && x == chess.length-1) {  
            int step=1;  
            while(row-step>=0&&x-step>=0){  
                if(chess[row-step][x-step]==queen){  
                    return false;     
                }  
                step++;  
            }  
        }  
  
        for (int i = 0; i < row; i++) {  
            if (chess[i][x] == queen) {  
                return false;     
            }  
        }  
  
        return true;  
    }  
  
    public static void putQueen(short[][] chess, int row) {  
  
        // 摆完一盘  
        if (row == chess.length) {  
            if(queenNumber(chess)){  
                result++;  
            }     
            return;  
        }  
  
        for (int i = 0; i < chess.length; i++) {  
            //清除原本的摆放记录  
            for (int j = 0; j < chess.length; j++) {  
                if(chess[row][j]!=0){  
                    chess[row][j] = 1;  
                }  
            }  
  
            if (isSafety(chess, row, i, 6)&&chess[row][i]==1) {  
                //摆放白皇后  
                chess[row][i] = 6;  
  
                for (int k = 0; k < chess.length; k++) {  
                    //清除原本的摆放记录  
                    for (int l = 0; l < chess.length; l++) {  
                        if (chess[row][l] != 0 && l != i) {  
                            chess[row][l] = 1;  
                        }  
                    }  
  
                    if (isSafety(chess, row, k, 9)&&chess[row][k]==1&&k != i) {  
                        //摆放黑皇后  
                        chess[row][k]=9;  
                        //摆放下一行  
                        putQueen(chess, row + 1);  
  
                    }  
                }  
            }  
        }  
  
    }  
  
    public static boolean queenNumber(short[][] chess){  
        int white=0,black=0;  
        for(int i=0;i<chess.length;i++){  
            for(int j=0;j<chess.length;j++){  
                if(chess[i][j]==6){  
                    white++;  
                }  
                if(chess[i][j]==9){  
                    black++;  
                }  
                  
            }  
        }  
        if(white==chess.length&&black==chess.length){  
            return true;  
        }  
        return false;  
    }  
  
    public static void main(String[] args) {  
        Scanner console = new Scanner(System.in);  
        int n = console.nextInt();  
        short[][] chess = new short[n][n];  
  
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {  
                chess[i][j] = (short) console.nextInt();  
            }  
        }  
  
        putQueen(chess, 0);  
        System.out.println(result);  
  
    }  
}  