class Solution {
    public int[] findEvenNumbers(int[] arr) {
        int freq[]=new int[10];
        ArrayList<Integer>res=new ArrayList<>();
        for(int a:arr){
            freq[a]++;
        }
        for(int i=100;i<=998;i+=2){
            int a=i/100;
            int b=(i/10)%10;
            int c=i%10;
            int loc[]=new int[10];
            loc[a]++;
            loc[b]++;
            loc[c]++;
            boolean valid=true;
            for(int k=0;k<10;k++){
                if(loc[k]>freq[k]){
                    valid=false;
                    break;
                }
            }
                if(valid)
                res.add(i);
            }
            
        int ans[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}