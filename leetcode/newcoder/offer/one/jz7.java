package newcoder.offer.one;

public class jz7 {

    public static class Solution {
        public int Fibonacci(int n) {
            int c = 0;
            int a = 0;
            int b = 1;
            if(n<0)
            {
                return -1;
            }
            if(n==0)
            {
                return 0;
            }

            while (--n>0)
            {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "," + s.Fibonacci(i));
        }
        System.out.println("test");
    }
}
