package newcoder.offer.five;

import java.util.Arrays;

public class jz45 {
    public static class Solution {
        public boolean IsContinuous(int [] numbers) {
            if(numbers.length!=5||numbers==null){
                return false;
            }
            Arrays.sort(numbers);
            int zeros = 0;
            int dis = 0;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i]==0){
                    zeros++;

                }else {
                    break;
                }
            }
            for (int i = zeros; i < numbers.length-1; i++) {
                if(numbers[i+1]==numbers[i]){
                    return false;
                }
                dis += numbers[i+1]-numbers[i]-1;

            }
            if(zeros>=dis)
            {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,3,2,6,4};
        Solution s = new Solution();
        boolean b = s.IsContinuous(arr);
        System.out.println(b);

    }
}
