package com.leetcode.problems;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LRUCache {

    class Node {
        int key;
        int value;

        public Node() {
            this.key = 0;
            this.value = 0;
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public Node(Node node) {
            this.key = node.key;
            this.value = node.value;
        }
    }

    int length;
    Map<Integer, Node> m = new HashMap<>();
    LinkedList<Node> list = new LinkedList<>();

    public LRUCache(int capacity) {
        this.length = capacity;
    }

    public int get(int key) {
        Node orDefault = m.getOrDefault(key, new Node(0, -1));
        if (orDefault.value != -1) {
            list.remove(orDefault);
            list.addFirst(orDefault);
        }
        return orDefault.value;
    }

    public void put(int key, int value) {
        if (list.size() < length) {
            if (m.containsKey(key)) {
                Node node = new Node(key, value);

                int i = list.indexOf(m.get(key));
                m.put(key, node);
                list.addFirst(node);
                list.remove(i + 1);
            } else {
                Node node = new Node(key, value);
                m.put(key, node);
                list.addFirst(node);
            }
        } else {
            if (m.containsKey(key)) {
                Node node = new Node(key, value);

                int i = list.indexOf(m.get(key));
                m.put(key, node);
                list.addFirst(node);
                list.remove(i + 1);
            } else {
                Node node = new Node(key, value);
                m.put(key, node);
                list.addFirst(node);
                Node node1 = list.removeLast();
                m.remove(node1.key);
            }
        }
    }
}


public class Problem146 {
    public static void main(String[] args) {

        test3();

        System.out.println("hello, world");
    }

    static void test1() {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        lRUCache.get(1);
        lRUCache.put(3, 3);
        lRUCache.get(2);
        lRUCache.put(4, 4);


        int i = lRUCache.get(1);
        i = lRUCache.get(3);
        i = lRUCache.get(4);


    }

    static void test2() {
        LRUCache lRUCache = new LRUCache(2);


        lRUCache.put(2, 1);
        lRUCache.put(1, 1);
        lRUCache.put(2, 3);
        lRUCache.put(4, 1);

        int i = lRUCache.get(1);
        i = lRUCache.get(2);
    }

    static void test3()
    {
        int i;
        LRUCache lRUCache = new LRUCache(10);
        lRUCache.put(10,13);
        lRUCache.put(3,17);
        lRUCache.put(6,11);
        lRUCache.put(10,5);
        lRUCache.put(9,10);
        i = lRUCache.get(13);// -1, -1
        lRUCache.put(2,19);
        i = lRUCache.get(2);// 19, 19
        i = lRUCache.get(3);// 17, 17
        lRUCache.put(5,25);
        i = lRUCache.get(8);// -1, -1
        lRUCache.put(9,22);
        lRUCache.put(5,5);
        lRUCache.put(1,30);
        i = lRUCache.get(11);// -1, -1
        lRUCache.put(9,12);
        i = lRUCache.get(7);// -1, -1
        i = lRUCache.get(5);// 5, 5
        i = lRUCache.get(8);// -1, -1
        i = lRUCache.get(9);// 12, 12
        lRUCache.put(4,30);
        lRUCache.put(9,3);
        i = lRUCache.get(9);// 3, 3
        i = lRUCache.get(10);// 5, 5
        i = lRUCache.get(10);// 5, 5
        lRUCache.put(6,14);
        lRUCache.put(3,1);
        i = lRUCache.get(3);// 1, 1
        lRUCache.put(10,11);
        i = lRUCache.get(8);// -1, -1
        lRUCache.put(2,14);
        i = lRUCache.get(1);// 30, 30
        i = lRUCache.get(5);// 5, 5
        i = lRUCache.get(4);// 30, 30
        lRUCache.put(11,4);
        lRUCache.put(12,24);
        lRUCache.put(5,18);
        i = lRUCache.get(13);// -1, -1
        lRUCache.put(7,23);
        i = lRUCache.get(8);// -1, -1
        i = lRUCache.get(12);// 24, 24
        lRUCache.put(3,27);
        lRUCache.put(2,12);
        i = lRUCache.get(5);// 18, -1
        lRUCache.put(2,9);
        lRUCache.put(13,4);
        lRUCache.put(8,18);
        lRUCache.put(1,7);
        i = lRUCache.get(6);// -1, -1
        lRUCache.put(9,29);
        lRUCache.put(8,21);
        i = lRUCache.get(5);// 18, -1
        lRUCache.put(6,30);
        lRUCache.put(1,12);
        i = lRUCache.get(10);// -1, -1
        lRUCache.put(4,15);
        lRUCache.put(7,22);
        lRUCache.put(11,26);
        lRUCache.put(8,17);
        lRUCache.put(9,29);
        i = lRUCache.get(5);// 18, -1
        lRUCache.put(3,4);
        lRUCache.put(11,30);
        i = lRUCache.get(12);// -1, 24
        lRUCache.put(4,29);
        i = lRUCache.get(3);// 4, 4
        i = lRUCache.get(9);// 29, 29
        i = lRUCache.get(6);// 30, 30
        lRUCache.put(3,4);
        i = lRUCache.get(1);// 12, 12
        i = lRUCache.get(10);// -1, -1
        lRUCache.put(3,29);
        lRUCache.put(10,28);
        lRUCache.put(1,20);
        lRUCache.put(11,13);
        i = lRUCache.get(3);// 29, 29
        lRUCache.put(3,12);
        lRUCache.put(3,8);
        lRUCache.put(10,9);
        lRUCache.put(3,26);
        i = lRUCache.get(8);// 17, 17
        i = lRUCache.get(7);// 22, 22
        i = lRUCache.get(5);// 18, -1
        lRUCache.put(13,17);
        lRUCache.put(2,27);
        lRUCache.put(11,15);
        i = lRUCache.get(12);// -1, -1
        lRUCache.put(9,19);
        lRUCache.put(2,15);
        lRUCache.put(3,16);
        i = lRUCache.get(1);// 20, 20
        lRUCache.put(12,17);
        lRUCache.put(9,1);
        lRUCache.put(6,19);
        i = lRUCache.get(4);// -1, -1
        i = lRUCache.get(5);// 18, -1
        i = lRUCache.get(5);// 18, -1
        lRUCache.put(8,1);
        lRUCache.put(11,7);
        lRUCache.put(5,2);
        lRUCache.put(9,28);
        i = lRUCache.get(1);// 20, 20
        lRUCache.put(2,2);
        lRUCache.put(7,4);
        lRUCache.put(4,22);
        lRUCache.put(7,24);
        lRUCache.put(9,26);
        lRUCache.put(13,28);
        lRUCache.put(11,26);
    }
}
