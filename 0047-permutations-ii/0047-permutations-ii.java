class Solution {
    void recursion(int nums[],boolean used[],List<List<Integer>>res,List<Integer>output){
        if(output.size()==nums.length){
            res.add(new ArrayList<>(output));
            return;
        }
        for(int i=0;i<nums.length;i++){
          if(used[i]) continue;
              if (i>0&&nums[i]==nums[i-1]&&!used[i-1])continue;
              used[i]=true;
                output.add(nums[i]);
                recursion(nums,used,res,output);
                output.remove(output.size()-1);
                used[i]=false;
        }
        }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>output=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        recursion(nums,used,res,output);
        return res;
        
    
    }
}