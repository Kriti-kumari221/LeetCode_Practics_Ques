class Solution {
    public int[] sortArray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}