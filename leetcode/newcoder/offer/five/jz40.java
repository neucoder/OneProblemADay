package newcoder.offer.five;

import java.util.HashMap;
import java.util.Map;

public class jz40 {
    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         *
         * @param array int整型一维数组
         * @return int整型一维数组
         */
        public int[] FindNumsAppearOnce (int[] array) {
                   // write code here
            int t = 0;
            for (int i = 0; i < array.length; i++) {
                t = t^array[i];
            }
            int flag = 1;
            while (true){
                if((t&flag)>0){

                    break;
                }
                flag<<=1;
            }
            int a = 0, b = 0;
            for (int i = 0; i < array.length; i++) {
                if((flag&array[i])>0){
                    a=a^array[i];
                }else {
                    b = b^array[i];
                }

            }
            return  a<b? new int[]{a, b}:new int[]{b,a};
        }


        public int[] FindNumsAppearOnce1 (int[] array) {
            // write code here
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                int key = array[i];
                map.put(key, 1+map.getOrDefault(key, 0));
            }
            int[] res = new int[2];
            int idx = 0;
            for (int i = 0; i < array.length; i++) {
                if(map.get(array[i])==1){
                    res[idx++] = array[i];
                }
            }
            if(res[1]<res[0]){
                int t =res[0];
                res[0] = res[1];
                res[1] = t;
            }
            return  res;
        }
    }
}
