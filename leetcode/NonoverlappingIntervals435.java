import java.util.Arrays;
import java.util.Comparator;

class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        return intervals.length-maxIntervals(intervals);
    }

    public int maxIntervals(int[][] intervals){
        if(intervals.length==0)
        {
            return 0;
        }
        int count = 1;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int end = intervals[0][1];
        for(int[] interval : intervals)
        {
            int start = interval[0];
            if(start>=end)
            {
                count++;
                end = interval[1];
            }
        }
        return count;
    }
}

public class NonoverlappingIntervals435 {
}
