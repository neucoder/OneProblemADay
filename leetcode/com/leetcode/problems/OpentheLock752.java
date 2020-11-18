package com.leetcode.problems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution752 {
    public int openLock(String[] deadends, String target) {

        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Set<String> deads = new HashSet<>();
        for (int i = 0; i < deadends.length; i++) {
            deads.add(deadends[i]);
        }
        q.offer("0000");
        visited.add("0000");
        int step = 0;
        while (!q.isEmpty())
        {
            int sz = q.size();

            for (int i = 0; i < sz; i++) {
                String poll = q.poll();
                if(deads.contains(poll))
                {
                    continue;
                }
                if(poll.equals(target))
                {
                    return step;
                }
                for (int j=0;j<4;j++)
                {
                    String up = plusOne(poll, j);

                    if(!visited.contains(up))
                    {
                        q.offer(up);
                        visited.add(up);
                    }

                    String down = minusOne(poll, j);
                    if(!visited.contains(down))
                    {
                        q.offer(down);
                        visited.add(down);
                    }


                }

            }
            step++;
        }
        return -1;
    }

    String plusOne(String s, int j)
    {
        char[] ch = s.toCharArray();
        if (ch[j] == '9')
            ch[j] = '0';
        else
            ch[j] += 1;
        return new String(ch);
    }

    String minusOne(String s, int j)
    {
        char[] ch = s.toCharArray();
        if (ch[j] == '0')
            ch[j] = '9';
        else
            ch[j] -= 1;
        return new String(ch);
    }

}

public class OpentheLock752 {
    public static void main(String[] args) {
        String[] deads = {"8888"};//{"0201","0101","0102","1212","2002"};
        Solution752 s = new Solution752();
        int i = s.openLock(deads, "0009");
        System.out.println(i);
        System.out.println("hello, world");
    }
}
