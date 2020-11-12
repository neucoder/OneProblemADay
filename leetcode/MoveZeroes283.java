import java.lang.reflect.Array;
import java.util.Arrays;

class Solution283 {
    public void moveZeroes(int[] nums) {
        if(nums.length==0 || nums.length==1)
        {
            return ;
        }
        int[] res = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0)
            {
                res[idx++]=nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }


    }
}



public class MoveZeroes283 {
    public static void main(String[] args) {
        Solution283 s = new Solution283();
        int[] i = {0,1,0,3,12};
        s.moveZeroes(i);
        System.out.println(Arrays.toString(i));
    }
}
