import java.util.Scanner;

public class Main2 {
    public static  void main(String[] args){
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();
        int K = in.nextInt();

        if( K == 0)
            return;

        char[][] dict = new char[N][M];
        String[] words = new String[K];
        for(int i = 0; i < K; i++){
            words[i] = in.next();
        }

        for(int i = 0 ; i < N; i++){
            for (int j = 0; j < M; j++){
                dict[i][j] = in.next().charAt(0);
            }
        }

        for(int i = 0 ; i < K; i++){
            String word = words[i];
            boolean[][] visited = new boolean[N][M];
            for(int m = 0 ; m < M; m++){
                for (int n = 0; n < N; n++){
                    visited[m][n] = false;
                }
            }
            boolean hasWord = false;
            for(int j = 0 ; j < N ;j++){
                for(int k = 0; k < M; k++){
                    if(hasWord(word,dict,N,M,j,k,0,visited)){
                        System.out.print(word + " ");
                        hasWord = true;
                        break;
                    }
                }
                if(hasWord)
                    break;
            }
        }

    }

    private static boolean hasWord(String word,char[][] dict,int rows,int cols,int row,int col,int depth,boolean[][] visited){
        if(depth == word.length()){
            return true;
        }

        boolean hasWord = false;
        if (row >= 0 && row <rows && col >=0 && col < cols && dict[row][col] == word.charAt(depth)&& !visited[row][col]){
            visited[row][col] =true;

            hasWord =  hasWord(word,dict,rows,cols,row - 1,col,depth + 1,visited ) ||
                    hasWord(word,dict,rows,cols,row + 1,col,depth + 1,visited ) ||
                    hasWord(word,dict,rows,cols,row ,col - 1,depth + 1,visited ) ||
                    hasWord(word,dict,rows,cols,row ,col + 1,depth + 1,visited );
            if(!hasWord)  visited[row][col] =false;
        }
        return hasWord;
    }
}
