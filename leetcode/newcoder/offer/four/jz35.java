package newcoder.offer.four;

public class jz35 {
    public static class Solution {
        //暴力方法求解，超时
        public int InversePairs(int[] array) {
            int cnt = 0;
            if (array == null || array.length < 2) {
                return 0;
            }
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        cnt++;
                        if (cnt >= 1000000007) {
                            cnt = cnt % 1000000007;
                        }
                    }
                }
            }
            return cnt % 1000000007;
        }

        //        利用归并排序
        public int InversePairs1(int[] array) {
            if (array.length <= 1) {
                return 0;
            }

            int[] copy = new int[array.length];
            int res = merge(array, 0, array.length - 1, copy);

            return res;

        }

        public int merge(int[] arr, int start, int end, int[] copy) {
            if (start == end) {
                copy[start] = arr[start];
                return 0;
            }
            int mid = start + (end - start) / 2;
            int left = merge(arr, start, mid, copy) % 1000000007;

            int right = merge(arr, mid + 1, end, copy) % 1000000007;
            int count = 0;
            int i = mid;
            int j = end;
            int index = end;
            while (i >= start && j >= mid + 1) {
                if (arr[i] > arr[j]) {
                    copy[index--] = arr[i--];
                    count += (j - mid);
                    if (count >= 1000000007) {
                        count = count % 1000000007;
                    }
                } else {
                    copy[index--] = arr[j--];
                }
            }
            while (i >= start) {
                copy[index--] = arr[i--];
            }
            while (j >= mid + 1) {
                copy[index--] = arr[j--];
            }

            for (int k = start; k <= end; k++) {
                arr[k] = copy[k];

            }
            return (count + left + right) % 1000000007;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[50000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 50000-i;
        }
        Solution s = new Solution();
        int i = s.InversePairs1(array);
        System.out.println(i);
    }


}
