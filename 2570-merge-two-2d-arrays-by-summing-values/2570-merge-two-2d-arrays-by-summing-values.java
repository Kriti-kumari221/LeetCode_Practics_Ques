class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        ArrayList<int[]>list=new ArrayList<>();
        while(i<n1&&j<n2){
            int id1=nums1[i][0];
            int id2=nums2[j][0];
            int val1=nums1[i][1];
            int val2=nums2[j][1];
            if(id1==id2){
                list.add(new int[]{id1,val1+val2});
                i++;
                j++;
            }
            else if(id1<id2){
                list.add(new int[]{id1,val1});
                i++;
            }
            else{
                list.add(new int[]{id2,val2});
                j++;
            }
        }
        while(i<n1){
            list.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j<n2){
            list.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }
        return list.toArray(new int[list.size()][]);

    }
}