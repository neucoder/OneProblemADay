package newcoder.offer.five;

import java.util.ArrayList;

public class jz41 {
    public class Solution {
        public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();

            if(sum<=0){
                return res;
            }

            int n = 2;
            int x0;
            while (n*n+n<=2*sum){
                if((2*sum-n*n+n)%(2*n)==0){
                    x0 = (2*sum-n*n+n)/2/n;
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int i = x0; i <= x0+n-1; i++) {
                        list.add(i);
                    }
                    res.add(list);
                }


                n++;
            }
            for (int i = 0; i < res.size()/2; i++) {
                ArrayList<Integer> t = res.get(i);
                res.set(i,res.get(res.size()-1-i));
                res.set(res.size()-1-i,t);
            }
            return res;
        }
        //滑动窗口
        public ArrayList<ArrayList<Integer>> FindContinuousSequence1(int sum) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();

            if(sum<=0){
                return res;
            }
            int left = 1;
            int right = 2;
            int arrsum = 0;
            while (left<right){
                arrsum = (left+right)*(right-left+1)/2;

                if(arrsum==sum){
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int i = left; i <= right; i++) {
                        list.add(i);
                    }
                    res.add(list);
                    left++;
                }else if(arrsum<sum){
                    right++;
                }else {
                    left++;
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {


        System.out.println("hello, world");
    }
}
