class Solution {
    
    public static boolean visited[][];
    
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0)==board[i][j] && wordsearch(i,j,0,word,board)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean wordsearch(int i,int j,int index,String word,char[][] board){
        
        if(index==word.length()) 
            return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index) || visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        
        if(wordsearch(i+1,j,index+1,word,board)||
           wordsearch(i,j+1,index+1,word,board)||
           wordsearch(i-1,j,index+1,word,board)||
           wordsearch(i,j-1,index+1,word,board)){
            return true;
        }
        
        visited[i][j]=false;
        return false;
    }
}