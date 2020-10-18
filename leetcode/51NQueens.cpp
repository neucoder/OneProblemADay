//
// Created by ys on 2020/10/18.
//
#include <iostream>
#include <vector>
using namespace std;


class Solution {
    vector<vector<string>> res;
public:
    vector<vector<string>> solveNQueens(int n) {
        vector<string> board(n, string(n,'.'));
        backtrace(board, 0);
        return res;
    }

    void backtrace(vector<string> board, int row)
    {
        if(board.size()==row)
        {
            res.push_back(board);
            return;
        }

        for (int col = 0; col < board.size(); ++col)
        {
            if(!isvalid(board, row, col))
                continue;
            board[row][col] = 'Q';
            backtrace(board, row+1);
            board[row][col] = '.';
        }
    }


    bool isvalid(vector<string> board, int row, int col)
    {
        for (int i = 0; i < row; ++i)
        {
            if(board[i][col]=='Q')
                return false;
        }

        for (int i=row-1, j=col-1;i>=0&&j>=0;--i,--j)
        {
            if(board[i][j]=='Q')
                return false;
        }

        int n = board.size();
        for (int i = row-1, j = col+1; i >=0 && j < n; --i, ++j)
        {
            if(board[i][j]=='Q')
                return false;
        }

        return true;

    }

    void printBoard()
    {
        int n = res.size();
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < res[0].size(); ++j)
            {
                for (int k = 0; k < res[0].size(); ++k)
                {
                    cout << res[i][j][k];
                }
                cout << endl;
            }
            cout << "------------------------------------------------------"<< endl;
        }
    }


};