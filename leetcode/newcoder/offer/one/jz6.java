package newcoder.offer.one;

public class jz6 {
    public class Solution {
        public int minNumberInRotateArray(int[] array) {
            int left = 0;
            int right = array.length - 1; // 注意
            int mid=0;
            while (left <= right) {
                mid = left + (right - left) / 2;
               if(array[left] < array[mid])
               {
                   left = mid;
               }else if(array[right] > array[mid])
               {
                   right = mid;
               }else
               {
                   break;
               }
            }
            return array[right];
        }
    }

    public static void main(String[] args) {
        System.out.println("hello, world");
    }
}
