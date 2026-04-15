class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max=0;
        int maxl=0;
        int freq[]=new int[26];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            max=Math.max(max,freq[s.charAt(right)-'A']);
            while((right-left+1)-max>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxl=Math.max(maxl,right-left+1);
        }
        return maxl;
    }
}