class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        // int maxfreq=0;
        // for(int count:map.values()){
        //     maxfreq=Math.max(maxfreq,count);
        // }
        // int countt=0;
        // for(int count:map.values()){
        //     if(count==maxfreq){
        //         countt+=count;
        //     }
        // }
        // return countt;
        int maxFreq=0,total=0;
        for(int count:map.values()){
            if(count>maxFreq){
                maxFreq=count;
                total=count;
            }
            else if(count==maxFreq){
                total+=count;
            }
        }
        return total;
    }
}