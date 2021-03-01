package newcoder.offer.five;

public class jz49 {
    public static class Solution {
        public int StrToInt(String str) {
            if(str==null||str.length()==0){
                return 0;
            }
            String res = "";

            boolean positive = true;
            if(str.charAt(0)=='+'||str.charAt(0)=='-'){
                if(str.length()==1){
                    return 0;
                }
                if(!(str.charAt(1)<='9'&&str.charAt(1)>='0')){
                    return 0;
                }
                if(str.charAt(0)=='-')
                {
                    positive = false;
                }

            }
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)<='9'&&str.charAt(i)>='0'){
                    res+=str.charAt(i);
                }else if(str.charAt(i)=='+'||str.charAt(i)=='-'){
                    if(i!=0){
                        return 0;
                    }else {
                        continue;
                    }
                }else {
                    return 0;
                }
            }
            int result = 0;
            int base = 1;
            for (int i = res.length()-1; i >=0 ; i--) {
                result+=(res.charAt(i)-'0')*base;
                base*=10;

            }
            return positive?result:-result;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.StrToInt("+434");
    }
}
