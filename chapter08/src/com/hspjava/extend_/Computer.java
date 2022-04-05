package com.hspjava.extend_;

public class Computer {
    private String cpu;
    private int memory;
    private int disk;

    //编写有参构造器
    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    //编写返回computer信息的getDetail方法
    public  String getDeatil(){
        return "cpu:"+cpu+"\nmemory:"+memory+"\ndisk:"+disk;
    }

    //编写所有属性的get和set方法
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
