class Solution {
    public int maxOperations(String s) {
        int n=s.length();
        int count=0;
        int ans=0;
        for(int i=0;i<n;){
            char ch=s.charAt(i);
            int j=0;
            if(ch=='0'){
                while(i+1<s.length()&&s.charAt(i+1)=='0'){
                    i++;
                }
                ans+=count;
            }
            else{
                count++;
            }
            i++;
        }
        return ans;
    }
}