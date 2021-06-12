package com.leetcode.test;

import java.util.HashSet;
import java.util.Objects;

class Dog{
    String name;

    public Dog() {
        this(null);
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

@FunctionalInterface
interface PrintHello{
    public void printHello();
}

@SuppressWarnings("all")
public class Test {
    public static void main(String[] args) {
        Dog d1  = new Dog("tom");
        Dog d2 = new Dog("tom");

        HashSet s = new HashSet();
        s.add(d1);
        s.add(d2);
        System.out.println(s);
        Object o = new Object();
        System.out.println(o);

        PrintHello ph = ()->{
            System.out.println("print hello");
        };


    }
}
