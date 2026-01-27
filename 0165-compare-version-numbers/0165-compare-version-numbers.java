class Solution {
    public int compareVersion(String version1, String version2) {
        String v1[]=version1.split("\\.");
        String v2[]=version2.split("\\.");
        int n;
        if(v1.length>v2.length){
            n=v1.length;
        }
        else n=v2.length;
        for(int i=0;i<n;i++){
           int k= i<v1.length?Integer.parseInt(v1[i]):0;
           int t= i<v2.length?Integer.parseInt(v2[i]):0;
            if(k<t)return -1;
            if(k>t)return 1;
        }
        return 0;
    }
}