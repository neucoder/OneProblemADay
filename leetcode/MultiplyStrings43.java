class Solution43 {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] res = new int[m+n];
        for (int i = m-1; i >=0; i--) {
            for (int j = n-1; j >=0; j--)
            {
                int p1 = i+j;
                int p2 = p1+1;
                int sum = (num1.charAt(i)-'0')*(num2.charAt(j)-'0') + res[p2];
                res[p2] = sum%10;
                res[p1] += sum/10;
            }

        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if(s.length()==0&&res[i]==0)
            {
                continue;
            }else
            {
                s.append(res[i]);
            }

        }

        if(s.length()==0)
        {
            return "0";
        }
        return s.toString();
    }
}


public class MultiplyStrings43 {
    public static void main(String[] args) {

        Solution43 s = new Solution43();

        System.out.println(s.multiply("0","0"));
        System.out.println(s.multiply("0","1"));
        System.out.println(s.multiply("1","0"));
        System.out.println(s.multiply("1","1"));
        System.out.println(s.multiply("6","2"));
        System.out.println(s.multiply("123","456"));


    }
}
