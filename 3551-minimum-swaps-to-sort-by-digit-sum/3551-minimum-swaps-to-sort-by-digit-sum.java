import java.util.*;
class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        Integer[] indices=new Integer[n];
        for(int i=0;i<n;i++){
            indices[i]=i;
        }
        Arrays.sort(indices, (a, b) -> {
            int sumA=digitsum(nums[a]);
            int sumB=digitsum(nums[b]);
            if(sumA!=sumB){
                return Integer.compare(sumA,sumB);
            }
            else{
           return Integer.compare(nums[a],nums[b]);
            }
        });
        boolean[] visited=new boolean[n];
        int swap=0;
        for(int i=0;i<n;i++){
            if(visited[i]||indices[i]==i){
                continue;
            }
            int cycle=0;
            int j=i;
            while(!visited[j]){
                visited[j]=true;
                j=indices[j];
                cycle++;
            }
            if(cycle>1){
                swap+=cycle-1;
            }
            
        }
   return swap;
    }
    private static int digitsum(int n){
            int sum=0;
        n=Math.abs(n);
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
        }
}