public class maxSubSum {
    public int maxSubArray(int[] nums) {
        int result = 0;
        if (nums == null || nums.length < 1){
            return result;
        }
        int sumNow = 0;

        for (int i = 0; i < nums.length; i++){
            sumNow += nums[i];
            result = Math.max(sumNow, result);
            if (sumNow < 0) sumNow = 0;
        }
        return result;
    }
}
