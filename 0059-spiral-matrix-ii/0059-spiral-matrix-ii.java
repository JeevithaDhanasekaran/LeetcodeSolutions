class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiral2=new int[n][n];
        int top,down,left,right,dir,i,val;
        top=0;
        down=n-1;
        left=0;
        right=n-1;
        dir=0;val=1;
        while(top<=down && left<=right){
            if(dir==0){
                for(i=left;i<=right;i++){
                spiral2[top][i]=val;
                val++;
                }
                top++;
            }
            else if(dir==1){
                for(i=top;i<=down;i++){
                spiral2[i][right]=val;
                val++;
                }
                right--;
            }
            else if(dir==2){
                for(i=right;i>=left;i--){
                spiral2[down][i]=val;
                val++;
                }
                down--;
            }
            else{
                for(i=down;i>=top;i--){
                spiral2[i][left]=val;
                val++;
                }
                left++;
            }
            dir=(dir+1) %4;
        }
        return spiral2;
    }
}