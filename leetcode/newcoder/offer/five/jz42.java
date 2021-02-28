package newcoder.offer.five;

import java.util.ArrayList;

public class jz42 {
    public static class Solution {
        public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
            ArrayList<Integer> res = new ArrayList<>();
            int left = 0;
            int right = array.length-1;
            while (left<right){
                if(array[left]+array[right]==sum){

                    res.add(array[left]);
                    res.add(array[right]);
                    break;
                }else if(array[left]+array[right]<sum){
                    left++;
                }else{
                    right--;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,2,4,7,11,15};
        ArrayList<Integer> integers = s.FindNumbersWithSum(arr, 15);

    }
}
