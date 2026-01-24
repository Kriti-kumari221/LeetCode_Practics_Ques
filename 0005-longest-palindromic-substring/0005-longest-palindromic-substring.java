class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.length()<2)return s;
        int maxlen=1;
        int start=0;
        for(int i=0;i<s.length();i++){
            int len1=expend(s,i,i);
            int len2=expend(s,i,i+1);
            int max=Math.max(len1,len2);
            if(max>maxlen){
                maxlen=max;
                start=i-(max-1)/2;
            }
        }
        return s.substring(start,start+maxlen);   
    }
    int expend(String s,int left,int right){
        while(left>=0&& right<s.length() &&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}