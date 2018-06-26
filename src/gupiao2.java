public class gupiao2 {

    public static void main(String[] args) {
        int[] a = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(a));
    }

    //超出时间限制
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) return 0;
        int len = prices.length;
        int result = 0;

        for (int i = 0; i < len; i++) {
            int preMax = 0;
            int[] pro1 = new int[len];
            int min1 = prices[0];
            pro1[0] = 0;
            for (int j = 1; j < i; j++) {
                pro1[j] = Math.max(pro1[j - 1], prices[j] - min1);
                min1 = Math.min(min1, prices[j]);
                preMax = Math.max(pro1[j], preMax);
            }

            int[] pro2 = new int[len];
            int min2 = prices[i];
            pro2[i] = 0;
            int afterMax = 0;
            for (int k = i + 1; k < len; k++) {
                pro2[k] = Math.max(pro2[k - 1], prices[k] - min2);
                min2 = Math.min(min2, prices[k]);
                afterMax = Math.max(pro2[k], afterMax);
            }
            result = Math.max(result, preMax + afterMax);
        }
        return result;
    }

    //result
    public static int maxProfit2(int[] prices) {
        if (prices == null || prices.length < 1) return 0;
        int len = prices.length;

        int[] pro1 = new int[len];
        pro1[0] = 0;
        int min = prices[0];
        for(int i = 1; i < len; i++){
            pro1[i] = Math.max(pro1[i-1], prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        int[] pro2 = new int[len];
        pro2[len-1] = 0;
        int max = prices[len-1];
        for (int i = len-2; i > -1; i--){
            pro2[i] = Math.max(pro2[i+1], max - prices[i]);
            max = Math.max(max, prices[i]);
        }

        int result = 0;
        for (int i = 0; i < len; i++) {
            result = Math.max(result, pro1[i] + pro2[i]);
        }
        return result;
    }
}
