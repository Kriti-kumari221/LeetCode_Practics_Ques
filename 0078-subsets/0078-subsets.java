class Solution {
    void recursion(int nums[],int index ,List<Integer>output,List<List<Integer>>res){
        res.add(new ArrayList<>(output));
        for(int i=index;i<nums.length;i++){
            output.add(nums[i]);
            recursion(nums,i+1,output,res);
            output.remove(output.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>output=new ArrayList<>();
        recursion(nums,0,output,res);
        return res;
    }
}