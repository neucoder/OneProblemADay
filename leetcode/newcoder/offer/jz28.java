package newcoder.offer;

import java.util.Arrays;

public class jz28 {

    public class Solution {
        public int MoreThanHalfNum_Solution(int [] array) {
            if(array==null||array.length==0){
                return 0;
            }

            Arrays.sort(array);
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i]==array[array.length/2]){
                    count++;
                }
            }
            return count>array.length/2?array[array.length/2]:0;
        }

        public int MoreThanHalfNum_Solution1(int [] array) {
            if(array==null||array.length==0){
                return 0;
            }
            int times = 1;
            int val = array[0];
            for (int i = 1; i < array.length; i++) {
                if(times==0){
                    val = array[i];
                    times=1;
                }
                if(val==array[i]){
                    times++;
                }else {
                    times--;

                }

            }
            times=0;
            for (int i = 0; i < array.length; i++) {
                if(val==array[i]){
                    times++;
                }
            }

            return times>array.length/2?val:0;
        }
    }

}
