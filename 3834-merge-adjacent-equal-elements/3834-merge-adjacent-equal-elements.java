import java.util.*;

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long>res=new ArrayList<>();
        for(int x:nums){
            res.add((long)x);
        }
        int n=nums.length;
        int i=0;
        while(i<res.size()-1){
            if(res.get(i).equals(res.get(i+1))){
                long sum=res.get(i)+res.get(i+1);
                res.set(i,sum);
                res.remove(i+1);
                 if(i>0){
                i--;
            }
            }
           
            else{
                i++;
            }
        }
        return res;
    }
}
