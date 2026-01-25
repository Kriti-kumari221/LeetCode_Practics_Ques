class Solution {
    public int maxArea(int[] arr) {
       int left=0;
       int right=arr.length-1;
       int maxarea=0;
       while(left<right){
        int height=Math.min(arr[left],arr[right]);
        int width=right-left;
        int area=height*width;
        maxarea=Math.max(maxarea,area);
        if(arr[left]<arr[right]){
            left++;
        }
        else{
            right--;
        }
       }
       return maxarea;
    }
}