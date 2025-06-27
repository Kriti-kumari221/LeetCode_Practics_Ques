class Solution {
    public int maxProfit(int[] prices) {
    int minprice=Integer.MAX_VALUE;
    int max=0;
    for (int i = 0; i < prices.length; i++) {
        if (prices[i]<minprice) {
            minprice=prices[i];
        }
        else{
            max=Math.max(max,prices[i]-minprice);
        }
    }
    return max;
}

}