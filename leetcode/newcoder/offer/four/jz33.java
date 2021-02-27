package newcoder.offer.four;

public class jz33 {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0){
            return 0;
        }
        int n2 = 0, n3 = 0, n5 = 0;
        int[] res = new int[index];
        res[0] = 1;
        for (int i = 1; i < index; i++) {
            int t = Math.min(res[n2]*2, Math.min(res[n3]*3, res[n5]*5));
            res[i] = t;
            if(t==res[n2]*2)
            {
                n2++;
            }
            if(t==res[n3]*3)
            {
                n3++;
            }
            if(t==res[n5]*5)
            {
                n5++;
            }
        }
        return res[index-1];
    }

    public static void main(String[] args) {
        jz33 jz33 = new jz33();
        int i = jz33.GetUglyNumber_Solution(7);
        System.out.println(i);
    }
}
