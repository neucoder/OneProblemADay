package newcoder.offer.two;

import java.util.LinkedList;

public class jz13 {
    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param array int整型一维数组
         * @return int整型一维数组
         */
        public int[] reOrderArray (int[] array) {
            // write code here
            if(array==null||array.length<2){
                return array;
            }
            LinkedList<Integer> arr1 = new LinkedList<>();
            LinkedList<Integer> arr2 = new LinkedList<>();


            for (int i = 0; i < array.length; i++) {
                if(array[i]%2==1){
                    arr1.add(array[i]);
                }else {
                    arr2.add(array[i]);
                }
            }
            int index = 0;
            for (int i = 0; i < arr1.size(); i++) {
                array[index++] = arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                array[index++] = arr2.get(i);
            }
            return array;
        }

        public int[] reOrderArray1 (int[] array) {
            // write code here
            if(array==null||array.length<2){
                return array;
            }

            int[] res = new int[array.length];
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i]%2==1){
                    res[index++] = array[i];
                }

            }
            for (int i = 0; i < array.length; i++) {
                if(array[i]%2==0){
                    res[index++] = array[i];
                }

            }
            return res;
        }

    }
}
