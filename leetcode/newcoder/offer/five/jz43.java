package newcoder.offer.five;

public class jz43 {
    public class Solution {
        public String LeftRotateString(String str,int n) {
            if(str.length()==0||str==null){
                return "";
            }
            if(n<1){
                return str;
            }
            n = n%str.length();
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < str.length()-n; i++) {
                res.append(str.charAt(n+i));
            }
            for (int i = 0; i < n; i++) {
                res.append(str.charAt(i));
            }
            return res.toString();
        }
    }
}
