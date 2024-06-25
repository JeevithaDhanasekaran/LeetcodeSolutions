class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a1=s.toCharArray();
        char[] a2=t.toCharArray();
        int arr[]=new int[26];
        for(int i=0;i<a1.length;i++)
            arr[a1[i]-'a']++;
        for(int i=0;i<a2.length;i++)
            arr[a2[i]-'a']--;
        for(int i=0;i<26;i++)
            if(arr[i]!=0)
                return false;
        return true;
    }
}