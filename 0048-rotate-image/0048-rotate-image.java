class Solution {
    public void rotate(int[][] matrix) {
        int left,right,i,j,temp;
        for(i=0;i<matrix.length;i++){
            for(j=i;j<matrix.length;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(i=0;i<matrix.length;i++){
            left=0;right=matrix.length-1;
            while(left<right){
                temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(matrix);
    }
}