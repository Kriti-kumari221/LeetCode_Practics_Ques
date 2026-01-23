class Solution {
    public int totalNumbers(int[] digits) {
        int freq[]=new int[10];
        for(int a:digits){
            freq[a]++;
        }
        List<Integer>res=new ArrayList<>();
        for(int i=100;i<=998;i+=2){
            int a=i/100;
            int b=(i/10)%10;
            int c=i%10;
            int loc[]=new int[10];
            loc[a]++;
            loc[b]++;
            loc[c]++;
            boolean valid=true;
            for(int j=0;j<10;j++){
                if(loc[j]>freq[j]){
                    valid=false;
                }
            }
            if(valid)
            res.add(i);
        }
        return res.size();
    }
}