class Solution {
    void rec(int []nums,List<List<Integer>>res,List<Integer>output){
        if(output.size()==nums.length){
            res.add(new ArrayList<>(output));
        }
        for(int i=0;i<nums.length;i++){
            if(!output.contains(nums[i])){
            output.add(nums[i]);
            rec(nums,res,output);
            
            output.remove(output.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>output=new ArrayList<>();
        rec(nums,res,output);
        return res;
    }

}