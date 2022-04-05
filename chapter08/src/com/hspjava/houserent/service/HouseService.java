package com.hspjava.houserent.service;

import com.hspjava.houserent.domain.House;

public class HouseService {

    private int houseNum = 1;
    private House[] houses;//保存House对象
    private int idCounter = 1;

    public HouseService(int size) {
        houses = new House[size];
        //初始化一个信息，用于测试
        houses[0] = new House(1,"jack","139","海淀区",2000,"未出租");
    }

    //房屋显示列表list方法
    public House[] list(){
        return houses;
    }



    //添加房屋 add 方法
    public boolean add(House newHouse){
        if (houseNum ==houses.length) {
            System.out.println("数组已满，不能添加····");
            return false;
        }
        houses[houseNum++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    //查找房屋信息 search 方法
    public House search(int searId){
        for (int i = 0; i < houseNum; i++) {
            if (searId == houses[i].getId()) {
                return houses[i];
            }
        }
       return null;
    }

    //删除房屋信息 del 方法
    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = delId; i < houseNum -1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;
        return true;
    }
}
