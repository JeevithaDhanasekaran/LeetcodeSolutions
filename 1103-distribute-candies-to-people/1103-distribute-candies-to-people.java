class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] dcandy=new int[num_people];
        int count=1;
        while(candies>0){
            for(int i=0;i<num_people && candies>0;i++){
                if(candies-count>0)
                    dcandy[i]+=count;
                else
                    dcandy[i]+=candies;
                candies-=count;
                count++;
            }
        }
        return dcandy;
    }
}