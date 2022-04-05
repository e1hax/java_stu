package com.hspjava.houserent;

import com.hspjava.houserent.domain.House;
import com.hspjava.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
//        House house = new House(1, "marry", "139", "昌平", 1000, "未出租");
//        System.out.println(house);

        new HouseView().mainMenu();
        System.out.println("系统退出---");

    }
}
