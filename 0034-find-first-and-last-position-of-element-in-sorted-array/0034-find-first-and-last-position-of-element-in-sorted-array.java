class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] occr=new int[2];
        int j=0,n=nums.length;
        int first=0,last=n-1;
        for(int i=first;i<n;i++){
            if(nums[first]!=target)
                first++;
            if(nums[last]!=target)
                last--;
        }
        if(first<=last){
            occr[j++]=first;
            occr[j++]=last;
        }
        else{
            occr[j++]=-1;
            occr[j++]=-1;
        }
        return occr;
    }
}