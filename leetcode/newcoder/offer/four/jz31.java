package newcoder.offer.four;

public class jz31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        //暴力解法
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            int num = i;
            while (num>0){

                if(num%10==1){
                    cnt++;
                }
                num = num/10;
            }
            res += cnt;
        }
        return res;

    }

}
