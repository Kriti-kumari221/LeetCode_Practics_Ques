class Solution {
    public int findClosest(int x, int y, int z) {
        int ax=Math.abs(x-z);
        int ay=Math.abs(y-z);
        if(ax<ay)return 1;
        else if(ax>ay)return 2;
        else return 0;
    }
}