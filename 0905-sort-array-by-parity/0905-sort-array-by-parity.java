class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
           if(arr[i]%2>arr[j]%2){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
           if(arr[i]%2==0) i++;
           if(arr[j]%2==1) j--;
        }
        return arr;
    }
}