package newcoder.offer.six;

import java.util.Arrays;

public class jz51 {
    public static class Solution {
        public int[] multiply(int[] A) {
            if(A.length<=0){
                return new int[0];
            }
            int[] b = new int[A.length];
            b[0] = 1;
            for (int i = 1; i < A.length; i++) {
                b[i] = b[i-1]* A[i-1];
            }
            int t = 1;
            for (int i = A.length-2; i >=0 ; i--) {
                t = t*A[i+1];
                b[i] = b[i]*t;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int []a = {1,2,3,4,5};
        int[] b = s.multiply(a);
        System.out.println(Arrays.toString(b));
        System.out.println();
    }
}
