package newcoder.offer.six;

public class jz53 {
    public boolean isNumeric(String str) {
        // write code here
        if(str==null||str.length()==0){
            return false;
        }
        boolean e = false, dot = false, sign = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='.'){
                if(e||dot){
                    return false;
                }
                dot = true;
            }else if(str.charAt(i)=='e'||str.charAt(i)=='E'){
                if(i==str.length()-1){
                    return false;
                }
                if(e){
                    return false;
                }
                e = true;
            }else if(str.charAt(i)=='+'||str.charAt(i)=='-'){
                if(sign&&str.charAt(i-1)!='e'&&str.charAt(i-1)!='E'){
                    return false;
                }
                if(!sign&&i>0&&str.charAt(i-1)!='e'&&str.charAt(i-1)!='E'){
                    return false;
                }
                sign=true;

            }else if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                return false;
            }
        }

        return true;
    }
}
