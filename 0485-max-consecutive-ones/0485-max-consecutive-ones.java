class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Max_count=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>Max_count)
                    Max_count=count;
            }
            else
                count=0;
        }
        return Max_count;
    }
}