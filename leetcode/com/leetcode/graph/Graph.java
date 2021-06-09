package com.leetcode.graph;


import java.util.Arrays;

class Node{
    private int val;
    private int weight;
    private Node[] nodes;

    public Node(int val) {
        this.val = val;
    }

    public Node(){

    }

    public Node(int val, int weight, Node[] nodes) {
        this.val = val;
        this.weight = weight;
        this.nodes = nodes;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node[] getNodes() {
        return nodes;
    }

    public void setNodes(Node[] nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", weight=" + weight +
                ", nodes=" + Arrays.toString(nodes) +
                '}';
    }
}

public class Graph {


    public static void main(String[] args) {


    }
    private static void print(int[][] arr){
        System.out.println(arr[8][5]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}
