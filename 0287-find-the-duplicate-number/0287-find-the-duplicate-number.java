class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> nodup=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!nodup.add(nums[i]))
                return nums[i];
        }
        return -1;
    }
}