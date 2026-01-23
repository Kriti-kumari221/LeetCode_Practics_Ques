class Solution {
    public int[] findEvenNumbers(int[] arr) {
        int n=arr.length;
        int count=1;
        Set<Integer> set = new HashSet<>();
        int p=0;
        int digit=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                continue;
            }
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                for(int k=0;k<n;k++){
                    if(i==k||j==k){
                        continue;
                    }
                    sum=arr[i]*100+arr[j]*10+arr[k];
                    if(sum%2==0){
                        set.add(sum);
                    }
                }
            }
        }
        int res[] = new int[set.size()];
        for(int k:set){
            res[p++]=k;
        }
         Arrays.sort(res);
        return res;
    }
}