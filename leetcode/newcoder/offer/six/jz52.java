package newcoder.offer.six;

public class jz52 {
    public boolean match (String str, String pattern) {
        if(pattern.length()==0){
            return str.length()==0;
        }
        boolean match = (str.length()>0&&(str.charAt(0)==pattern.charAt(0)||pattern.charAt(0)=='.'));
        if(pattern.length()>1&&pattern.charAt(1)=='*'){
            return match(str, pattern.substring(2))||(match&&match(str.substring(1), pattern));
        }
        return match && match(str.substring(1), pattern.substring(1));
    }
}
