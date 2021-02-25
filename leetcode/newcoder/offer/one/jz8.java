package newcoder.offer.one;

public class jz8 {
    public class Solution {
        public int JumpFloor(int target) {
            int [] res = new int[target+1];
            if(target==1)
            {
                return 1;
            }
            if(target==2)
            {
                return 2;
            }
            res[1] = 1;
            res[2] = 2;
            for (int i = 3; i <= target; i++) {
                res[target] = res[target-1]+res[target-2];
            }
            return res[target];

        }
    }
}
