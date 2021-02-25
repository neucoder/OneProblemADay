package newcoder.offer.four;

import java.util.ArrayList;
import java.util.Comparator;

public class jz32 {
    public class Solution {
        public String PrintMinNumber(int [] numbers) {
            if(numbers==null||numbers.length==0){
                return null;
            }
            if(numbers.length==1){
                return ""+numbers[0];
            }
            String res = "";
            ArrayList<Integer> num = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                num.add(numbers[i]);
            }
            num.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    int a = Integer.parseInt(""+o1+o2);
                    int b = Integer.parseInt(""+o2+o1);

                    return a - b;
                }
            });

            for (int i = 0; i < num.size(); i++) {
                res+=num.get(i);
            }
            return res;
        }


    }



    public static void main(String[] args) {
        System.out.println("hello, world");
    }
}
