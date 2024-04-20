class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length ==0 || strs==null)
                return "";

        String prefix=strs[0];
        int prefix_len= prefix.length();

        for(int i=1;i<strs.length;i++)
        {
            while(prefix_len>strs[i].length() || !prefix.equals(strs[i].substring(0,prefix_len))){
                prefix_len-=1;
                if(prefix_len==0)
                    return "";
                prefix=prefix.substring(0,prefix_len);
            }
        }
        return prefix;
    }

    public static void main(String args[]){
        Solution solution=new Solution();
        String[] strs=new String[200];
        for(int i=0;i<strs.length;i++)
        {
            strs[i]=new Scanner(System.in).nextLine();
        }
        System.out.println(solution.longestCommonPrefix(strs));
    }
}