
class Solution1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length==1)
        {
            return 0;
        }


        int res = 0;
        for (int i = 0; i < points.length-1; i++) {
            res+=second(points[i],points[i+1]);
        }
        return res;
    }

    int second(int[] p1, int[] p2){
        int x1 = Math.abs(p1[0]-p2[0]);
        int x2 = Math.abs(p1[1]-p2[1]);
        int res = Math.min(x1,x2)+Math.abs(x1-x2);
        return res;
    }
}


public class MinimumTimeVisitingAllPoints1266 {
}
