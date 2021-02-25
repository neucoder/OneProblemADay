package newcoder.offer.three;

import java.util.ArrayList;
import java.util.Arrays;

public class jz29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> integers = new ArrayList<>();
        if(input==null||input.length==0||input.length<k){
            return integers;
        }
        Arrays.sort(input);

        for (int i = 0; i < k; i++) {
            integers.add(input[i]);
        }
        return integers;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
