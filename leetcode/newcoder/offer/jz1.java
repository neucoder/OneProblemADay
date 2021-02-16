package newcoder.offer;

public class jz1 {

    public static class Solution {
        /*
        暴力解法
         */
        public boolean Find(int target, int [][] array) {
            if(array.length==0||array==null)
            {
                return false;
            }
            int n = array[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(array[i][j]==target){
                        return true;
                    }
                }
            }
            return false;

        }

        /**
         * 利用数组的递增特性
         * @param target
         * @param array
         * @return
         */
        public boolean Find1(int target, int [][] array) {
            if(array.length==0||array==null)
            {
                return false;
            }
            int n = array[0].length;
            int row = n-1;
            int col = 0;
            for(;col<n && row>=0;){
                if(array[col][row]>target)
                {
                    row--;
                }else if(array[col][row]<target){
                    col++;
                }else {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] ints = {{1}};
        boolean find = s.Find(7, ints);
        System.out.println(find);
        System.out.println("hello, world");
    }
}
