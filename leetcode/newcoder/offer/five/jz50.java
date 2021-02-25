package newcoder.offer.five;

public class jz50 {
    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param numbers int整型一维数组
         * @return int整型
         */
        public int duplicate (int[] numbers) {
            // write code here
            if(numbers.length==0||numbers==null){
                return -1;
            }
            int[] res = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                res[numbers[i]]++;
            }
            for (int i = 0; i < numbers.length; i++) {
                if(res[numbers[i]]>1){
                    return numbers[i];
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

}
