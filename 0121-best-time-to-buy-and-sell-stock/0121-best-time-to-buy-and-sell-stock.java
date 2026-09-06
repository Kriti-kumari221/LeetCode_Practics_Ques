class Solution {
    public int maxProfit(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]-min);
        }
        return max;
    }
}