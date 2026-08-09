class Solution {
    public int[] sortArrayByParity(int[] arr) {
       int i=0;
       int j=arr.length-1;
       while(i<j){
        if(arr[i]%2>arr[j]%2){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        else if(arr[i]%2==0) i++;
        else j--;
       }
       return arr;
    }
}