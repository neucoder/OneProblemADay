import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int openLock(String[] deadends, String target) {

        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        return 0;
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
        System.out.println("hello, world");
    }
}
