package com.leetcode.problems;

import com.leetcode.datastructs.Node;
import com.leetcode.utils.ConstructData;

import java.util.ArrayList;
import java.util.Arrays;

class Solution116 {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        connectTwoNode(root.left, root.right);
        return root;
    };

    public void connectTwoNode(Node node1, Node node2) {
        if(node1==null||node2==null)
        {
            return;
        }
        node1.next = node2;
        connectTwoNode(node1.left, node1.right);
        connectTwoNode(node2.left, node2.right);
        connectTwoNode(node1.right, node2.left);
    }
}


public class Problem116 {
    public static void main(String[] args) {

        Solution116 s = new Solution116();
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Node node = ConstructData.buildNodeTree(integers);
        Node connect = s.connect(node);

        System.out.println("hello,world");
    }
}
