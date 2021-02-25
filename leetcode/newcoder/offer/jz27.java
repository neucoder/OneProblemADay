package newcoder.offer;

import java.util.*;

public class jz27 {
    public static class Solution {

        Set<String> res = new HashSet<String>();
        public ArrayList<String> Permutation(String str) {
            if(str==null||str.length()==0){
                return null;
            }

            backtrack(new LinkedList<Character>(), str);
            ArrayList<String> strings = new ArrayList<>(res);
            strings.sort(Comparator.naturalOrder());
            return strings;
        }
        public void backtrack(LinkedList<Character> path, String str){
            if(str.length()==path.size()){
                String s = "";
                for(Character c:path){
                    s+=c;
                }
                res.add(s);
                return;
            }

            for (int i = 0; i < str.length(); i++) {

                path.add(str.charAt(i));
                backtrack(path, str);
                path.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<String> abc = solution.Permutation("ab");
        for(String i:abc){
            System.out.println(i);
        }
        System.out.println("hello, world");
    }
}
