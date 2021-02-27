package newcoder.offer.four;

public class jz37 {
    public static class Solution {
        public int GetNumberOfK(int [] array , int k) {
            int cnt = 0;
            int left = 0;
            int right = array.length-1;

            while (left<=right){
                int mid = left + (right-left)/2;
                if(array[mid]<k)
                {
                    left = mid+1;
                }else if(array[mid]>=k){
                    right = mid-1;
                }
            }
            int l = left;
            right = array.length-1;
            while (l<=right){
                int mid = l + (right-l)/2;
               if(array[mid]>k){
                    right = mid-1;
                }else if(array[mid]<=k)
                   {
                       l = mid+1;
                   }

            }
            return right-left+1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5};
        Solution s = new Solution();
        int i = s.GetNumberOfK(arr, 3);
        System.out.println(i);
    }
}
