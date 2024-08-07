class Solution {
    public int reverse(int x) {
        int rev=0;
        boolean sign=(x>0)?true:false;
        while(x!=0){
            int d=x%10;
            if(sign == true && rev > Integer.MAX_VALUE/10)
            return 0;
            if(sign==false && rev<Integer.MIN_VALUE/10)
            return 0;
            rev=(rev*10)+(x%10);
            x=x/10;
        }
        return rev;
    }
}