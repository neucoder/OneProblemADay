//
// Created by ys on 2020/10/16.
//

#include <vector>
using namespace std;

class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {

        vector<vector<int >> res;
        vector<int> track;
        backtrack(nums, track, res);

        return res;

    }

    void backtrack(vector<int>& nums, vector<int>track, vector<vector<int>> &res)
    {
        if(track.size()==nums.size())
        {
            res.push_back(track);
            return;
        }

        for (int i = 0; i < nums.size(); ++i)
        {
            if(in(nums[i], track))
                continue;
            track.push_back(nums[i]);
            backtrack(nums, track, res);
            track.pop_back();
        }
    }

    bool in(int i, vector<int> &v)
    {
        for (int j = 0; j < v.size(); ++j)
        {
            if(i==v[j])
                return true;
        }

        return false;
    }

};