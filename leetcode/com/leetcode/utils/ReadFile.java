package com.leetcode.utils;

import com.leetcode.problems.Problem239;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String path = Problem239.class.getResource("data.txt").getPath();
        FileReader data = new FileReader(new File(path));
        StringBuilder sb = new StringBuilder();
        char[] buffer =  new char[1024*8];
        while (data.read(buffer)!=-1)
        {
            sb.append(buffer);
        }
    }

    public static String readFile(String fileName) throws IOException {
        String path = Problem239.class.getResource(fileName).getPath();
        FileReader data = new FileReader(new File(path));
        StringBuilder sb = new StringBuilder();
        char[] buffer =  new char[8];
        while (data.read(buffer)!=-1)
        {
            sb.append(buffer);
        }

        return sb.toString();
    }
}
