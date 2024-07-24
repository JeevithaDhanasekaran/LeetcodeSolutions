class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int l=0,r=0,max=0;
        while(l<s.length() && r<s.length()){
            if(set.add(s.charAt(r))){
                max=Math.max(r-l+1,max);
                r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}