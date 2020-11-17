package com.leetcode.problems;

class Solution67 {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int i = a.length()-1;
        int j = b.length()-1;
        int c = 0;
        int sum = 0;
        while (i>=0||j>=0)
        {
            sum = c;
            if(i>=0) sum += a.charAt(i)-'0';
            if(j>=0) sum += b.charAt(j)-'0';
            sb.append(sum%2);
            c = sum/2;
            i--;
            j--;
        }
        if(c!=0)
        {
            sb.append(c);
        }
        return sb.reverse().toString();


    }
}

public class AddBinary67 {
}
