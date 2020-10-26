class Solution1556 {
    public String thousandSeparator(int n) {
        String s = "0123456789";
        char[] ss = new char[10];
        int l = 0;
        if(n==0)
        {
            return "0";
        }
        while (n > 0)
        {
            ss[l] = s.charAt(n % 10);
            n = n/10;
            l++;

        }
        String res = "";
        for (int i = 0; i < l; i++) {
            res+=ss[i];
            if((i+1)%3==0)
            {
                res+=".";
            }
        }
        StringBuffer reverse = new StringBuffer(res).reverse();
        if(reverse.charAt(0)=='.')
        {
            reverse = reverse.delete(0,1);
        }
        return new String(reverse);
    }

}



public class ThousandSeparator1556 {
    public static void main(String[] args) {
        Solution1556 s = new Solution1556();
        System.out.println(s.thousandSeparator(0));
        System.out.println(s.thousandSeparator(987));
        System.out.println(s.thousandSeparator(1234));
        System.out.println(s.thousandSeparator(123456789));
        System.out.println(s.thousandSeparator(0));
        System.out.println(s.thousandSeparator(0));
        System.out.println(s.thousandSeparator(0));

    }
}
