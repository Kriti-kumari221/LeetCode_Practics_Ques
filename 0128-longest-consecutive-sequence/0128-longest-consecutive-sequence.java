class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=0;
        for(int sett:set){
            if(!set.contains(sett-1)){
            int crrent=sett;
            int steack=1;
            while(set.contains(crrent+1)){
                crrent++;
                steack++;
            }
            max=Math.max(max,steack);

        }
        
    }
    return max;
}
}