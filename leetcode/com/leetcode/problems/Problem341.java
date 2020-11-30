package com.leetcode.problems;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * 哈哈
 * **/

/**
 * 注释
 */
class NestedInteger {
    // 如果其中存的是一个整数，则返回 true，否则返回 false
    public boolean isInteger() {
        return false;
    }

    // 如果其中存的是一个整数，则返回这个整数，否则返回 null

    /**
     *
     * @return
     */
    public Integer getInteger() {
        return null;
    }

    // 如果其中存的是一个列表，则返回这个列表，否则返回 null
    public List<NestedInteger> getList() {
        return null;
    }
}

class NestedIterator implements Iterator<Integer> {
    // 构造器输入一个 NestedInteger 列表
    Iterator<Integer> it;
    public NestedIterator(List<NestedInteger> nestedList) {
        List<Integer> result = new LinkedList<>();
        for(NestedInteger ni:nestedList)
        {
            traverse(ni, result);
        }
        it = result.iterator();
    }

    public void traverse(NestedInteger nestedList, List<Integer> result)
    {
        if(nestedList.isInteger())
        {
            result.add(nestedList.getInteger());
        }

        for(NestedInteger NI :nestedList.getList())
        {
            traverse(NI, result);
        }

    }

    // 返回下一个整数
    public Integer next() {
        return it.next();
    }

    // 是否还有下一个整数？
    public boolean hasNext() {
        return it.hasNext();
    }
}

public class Problem341 {
    public static void main(String[] args) {

        System.out.println("Hello, World");
    }
}
