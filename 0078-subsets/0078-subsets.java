class Solution {
    void rec(int nums[],int index,List<List<Integer>>ans,List<Integer>output){
        if(index==nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        output.add(nums[index]);
        rec(nums,index+1,ans,output);
        output.remove(output.size() - 1);
        rec(nums,index+1,ans,output);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        rec(nums,0,ans,new ArrayList<>());
    
    return ans;
}
}