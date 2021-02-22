package newcoder.offer;

import java.util.ArrayList;

public class jz19 {
    public class Solution {
        public ArrayList<Integer> printMatrix(int [][] matrix) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(matrix.length==0) return list;
            int n = matrix.length,m = matrix[0].length;
            if(m==0) return list;
            int layers = (Math.min(n,m)-1)/2+1;
            for(int i = 0; i < layers; i++){
                for(int k = i; k < m-i; k++) list.add(matrix[i][k]);//左至右
                for(int j = i+1; j < n-i; j++) list.add(matrix[j][m-i-1]);//右上至右下
                for(int k = m-i-2; (k >= i) && (n-i-1 != i); k--) list.add(matrix[n-i-1][k]);//右至左
                for(int j = n-i-2; (j>i) && (m-i-1 != i); j--) list.add(matrix[j][i]);//左下至左上
            }
            return list;

        }

        public ArrayList<Integer> printMatrix1(int [][] matrix) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            int row = matrix.length;
            int col = matrix[0].length;


            // 输入的二维数组非法，返回空的数组
            if (row == 0 || col == 0)  return result;

            int top = 0, left = 0, right = col-1, bottom = row-1;

            while(top <= bottom && left<= right){
                //left to right
                for(int i = left; i <= right; ++i) result.add(matrix[top][i]);
                //top tp bottom
                for(int i = top+1; i <= bottom; ++i) result.add(matrix[i][right]);
                //right to left
                for(int i = right-1; i >= left && top < bottom; --i) result.add(matrix[bottom][i]);
                //bottom to top
                for(int i = bottom-1; i > top && right > left; --i) result.add(matrix[i][left]);
                ++top; ++left; --right; --bottom;
            }
            return result;

        }
    }
}
