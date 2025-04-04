import java.util.Arrays;
class Solution {
    public int maxProfit(int[] prices) {
    if(prices==null || prices.length== 0) 
    return 0;    
    int min=prices[0], result=0;    
    for(int i=1;i<prices.length;i++) { 
        min=Math.min(min,prices[i]);
        result=Math.max(result,prices[i]-min);
     }
     return result;
    }
}