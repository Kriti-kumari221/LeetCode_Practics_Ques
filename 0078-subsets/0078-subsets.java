class Solution {
    void rec(int []nums,int index,List<List<Integer>>res, List<Integer>output){
        res.add(new ArrayList<>(output));
        for(int i=index;i<nums.length;i++){
            output.add(nums[i]);
            rec(nums,i+1,res,output);
            output.remove(output.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>output=new ArrayList<>();
        rec(nums,0,res,output);
        return res;
    }
}