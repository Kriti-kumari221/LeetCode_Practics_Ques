class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int []count=new int[1001];
        for(int n:nums1){
            ++count[n];
        }
        
        List<Integer>ans=new ArrayList<>();
        for(int n:nums2){
            if(count[n]>0){
                ans.add(n);
                --count[n];
            }
        }
        int []res=new int[ans.size()];
        int i=0;
        for(int n:ans){
            res[i++]=n;
        }
        return res;
    }
}