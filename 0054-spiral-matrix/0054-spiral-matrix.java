class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top,down,right,left,i,dir;
        top=0;
        down=matrix.length-1;
        left=0;
        right=matrix[0].length-1;
        dir=0;
        List<Integer> spiral=new ArrayList<Integer>();
        while(top<=down && left<=right){
            if(dir==0){
                for(i=left;i<=right;i++)
                spiral.add(matrix[top][i]);
                top++;
            }
            else if(dir==1){
                for(i=top;i<=down;i++)
                spiral.add(matrix[i][right]);
                right--;
            }
            else if(dir==2){
                for(i=right;i>=left;i--)
                spiral.add(matrix[down][i]);
                down--;
            }
            else{
                for(i=down;i>=top;i--)
                spiral.add(matrix[i][left]);
                left++;
            }
            dir=(dir+1) %4;
        }
        return spiral;
    }
}