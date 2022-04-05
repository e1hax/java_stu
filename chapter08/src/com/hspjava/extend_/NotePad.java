package com.hspjava.extend_;

public class NotePad extends Computer{
    private String brand;
    private String color;

    public NotePad(String cpu, int memory, int disk, String brand, String color) {
        super(cpu, memory, disk);
        this.brand = brand;
        this.color = color;
    }

    //打印电脑信息
    public void NotePadInfo(){
        System.out.println(getDeatil()+"\nbrand:"+brand+"\ncolor:"+color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
