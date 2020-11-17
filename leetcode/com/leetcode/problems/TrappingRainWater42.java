package com.leetcode.problems;

class Solution42 {
    public int trap(int[] height) {
        if(height.length<3)
        {
            return 0;
        }

        int n = height.length;
        int pdf = 0;
        for (int i = 0; i < n - 1; i++) {

            if(height[i]>height[i+1])
            {
                int m = 0;
                for (int j=i+2;j<n;j++)
                {
                    m = Math.max(m,height[j]);
                }
                for (int j=i+2;j<n-1;j++)
                {
                    if(height[j] > height[i] ||
                            (height[j]>height[j-1]&&height[j]>height[j+1] && height[j]>=m)||
                            height[height.length-1]>height[height.length-2]
                    )
                    {
                        int t = Math.min(height[i],height[j]);
                        for(int k=i+1;k<j;k++)
                        {
                            pdf += t-height[k];
                        }
                        i = j-1;
                        break;
                    }
                }
            }
        }
        return pdf;
    }
}


public class TrappingRainWater42 {
    public static void main(String[] args) {
        Solution42 solution42 = new Solution42();
        int trap = solution42.trap(new int[]{3,1,2});
        System.out.println(trap);

    }
}
