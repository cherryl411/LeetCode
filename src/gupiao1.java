public class gupiao1 {
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices == null || prices.length < 1){
            return result;
        }
        int[] profit = new int[prices.length];
        int min = 0;
        int max = prices[0];
        profit[0] = prices[0];
        for (int i = 1; i < prices.length; i++){
            profit[i] = Math.max(profit[i-1], prices[i] - min);
            min = Math.min(min, prices[i]);
            max = Math.max(profit[i], max);
        }
        result = max;
        return result;
    }
}
