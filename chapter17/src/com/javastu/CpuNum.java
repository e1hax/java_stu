package com.javastu;

/**
 * Created by e1hax on 2022/7/4.
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNums = runtime.availableProcessors();
        System.out.println("CPU数量"+cpuNums);

    }
}
