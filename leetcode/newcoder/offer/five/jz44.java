package newcoder.offer.five;

import java.util.ArrayList;

public class jz44 {
    public class Solution {
        public String ReverseSentence(String str) {
            if(str==null||str.length()==0){
                return "";
            }
            ArrayList<String> t = new ArrayList<>();
            String s = "";
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==' '){
                    if(s!=""){
                        t.add(s);
                    }
                    s = "";
                }else {
                    s+=str.charAt(i);
                }
            }
            if(s!=""){
                t.add(s);
            }
            String res = "";
            if(t.size()==0){
                return str;
            }
            for (int i = 0; i < t.size()-1; i++) {
                res+=t.get(t.size()-1-i)+' ';
            }
            res+=t.get(0);
            return res;
        }
    }
}
