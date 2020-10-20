//
// Created by ys on 2020/10/20.
//

#include <queue>
#include <iostream>
using namespace std;

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;

    TreeNode() : val(0), left(nullptr), right(nullptr)
    {}

    TreeNode(int x) : val(x), left(nullptr), right(nullptr)
    {}

    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right)
    {}
};

class Solution
{
public:
    int minDepth(TreeNode *root)
    {
        queue<TreeNode *> q;

        if(root== nullptr)
        {
            return 0;
        }
        q.push(root);
        int step = 1;
        while (q.size() != 0)
        {
            int sz = q.size();
            for (int i = 0; i < sz; ++i)
            {
                auto cur = q.front();
                if(cur->left==NULL&&cur->right==NULL)
                {
                    return step;
                }
                q.pop();
                if(cur->left!= nullptr)
                {
                    q.push(cur->left);
                }

                if(cur->right!=nullptr)
                {
                    q.push(cur->right);
                }
            }
            step++;
        }
        return step;
    }
};

void test()
{
    TreeNode *r = new TreeNode(3);
    TreeNode *r1 = new TreeNode(9);
    TreeNode *r2 = new TreeNode(20);
    TreeNode *r3 = new TreeNode(15);
    TreeNode *r4 = new TreeNode(7);
    TreeNode *r5 = new TreeNode(3);
    TreeNode *r6 = new TreeNode(3);
    r->left = r1;
    r->right = r2;
    r2->left = r3;
    r2->right = r4;
    Solution s;
    int l = s.minDepth(r);

    std::cout << l << std::endl;
}