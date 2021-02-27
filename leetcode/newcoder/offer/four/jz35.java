package newcoder.offer.four;

public class jz35 {
    public class Solution {
        public int InversePairs(int [] array) {
            int cnt = 0;
            if(array==null||array.length<2){
                return 0;
            }
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i+1; j < array.length; j++) {
                    if(array[i]>array[j])
                    {
                        cnt++;
                        if(cnt>=1000000007){
                            cnt= cnt%1000000007;
                        }
                    }
                }
            }
            return cnt%1000000007;
        }
    }
}
