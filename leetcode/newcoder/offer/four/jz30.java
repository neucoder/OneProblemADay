package newcoder.offer.four;

public class jz30 {
    public class Solution {
        public int FindGreatestSumOfSubArray(int[] array) {
            if(array==null||array.length==0){
                return 0;
            }
            int []dp = new int[array.length];
            dp[0] = array[0];

            for (int i = 1; i < array.length; i++) {
                dp[i] = Math.max(dp[i-1]+array[i], array[i]);
            }

            int res = Integer.MIN_VALUE;
            for (int i = 0; i < dp.length; i++) {
                res = Math.max(dp[i], res);
            }
            return res;
        }
    }
}
