package com.leetcode.dp;

import java.util.ArrayList;

public class LemonCharge {

    public boolean lemonadeChange(int[] bills) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < bills.length; i++) {
            if(bills[i]==5){
                res.add(bills[i]);
            }else if(bills[i]==10){
                if(res.contains(5)){
                    res.remove(new Integer(5));
                    res.add(bills[i]);
                }else {
                    return false;
                }

            }else {
                if(res.contains(5)&&res.contains(10)){
                    res.add(bills[i]);
                    res.remove(new Integer(5));
                    res.remove(new Integer(10));
                }else if(res.contains(5)){
                    res.remove(new Integer(5));
                    res.remove(new Integer(5));
                    boolean ret = res.remove(new Integer(5));
                    if(!ret){
                        return false;
                    }
                    res.add(bills[i]);
                }
                else {
                    return false;
                }
            }

        }
        return true;
    }
    public static void main(String[] args) {
        LemonCharge lc = new LemonCharge();
        int[] arr = {5,5,5,10,10,20,5,5,5};
        boolean b = lc.lemonadeChange(arr);
        System.out.println(b);
        System.out.println("hello, world");
    }
}
