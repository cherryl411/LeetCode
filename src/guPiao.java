import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class guPiao {
    public static void main(String[] args){
        int[] a = {5,2,15,9,10,1,3,20};
        int[] b = {1,2,-4,9,10,-8,3,20};
        System.out.println(bestBuyandSale(a));
        System.out.println(maxSum(b));
    }
    public static int bestBuyandSale(int[] a){
        int result = 0;
        if (a == null || a.length < 1){
            return result;
        }
        int len = a.length;
        int[] profit = new int[len];
        int max = 0;
        int min = a[0];
        profit[0] = a[0];
        for (int i = 1; i < len; i++){
            profit[i] = Math.max(profit[i-1], a[i]-min);
            max = Math.max(profit[i], max);
            min = Math.min(min, a[i]);
        }
        result = max;
        return result;
    }

    public static int maxSum(int[] a){
        int result = 0;
        if (a == null || a.length < 1){
            return result;
        }
        int thisSum = 0;
        int maxSum = 0;
        int len = a.length;
        for (int i = 0; i < len; i ++){
            thisSum += a[i];
            maxSum = Math.max(thisSum, maxSum);
            if (thisSum < 0){
                thisSum = 0;
            }
        }
        result = maxSum;

        return result;
    }

}
