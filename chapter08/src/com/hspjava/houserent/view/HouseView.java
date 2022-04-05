package com.hspjava.houserent.view;

import com.hspjava.houserent.domain.House;
import com.hspjava.houserent.service.HouseService;
import com.hspjava.houserent.utils.Utility;

public class HouseView {

    private boolean loop = true;
    private char key;
    private HouseService houseService =  new HouseService(10);

//主菜单
    public void mainMenu() {
        do {
            System.out.println("=============房屋出租系统菜单=============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 源");
            System.out.println("\t\t\t4 修 改 房 源 信 息");
            System.out.println("\t\t\t5 房 源 列 表");
            System.out.println("\t\t\t6 退 出 系 统");
            System.out.println("请输入选项（1-6）：");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    searchHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }

    //修改房屋信息，更具编号
    public void updateHouse(){
        System.out.println("==============修改房屋信息=============");
        System.out.println("请选择待修改房屋的编号(-1退出)：");
        int updId = Utility.readInt();
        if (updId == -1) {
            System.out.println("============放弃修改房屋信息===========");
            return;
        }
        House house = houseService.search(updId);
        if (house == null) {
            System.out.println("========编号不存在，修改房屋信息失败=======");
        }

        System.out.print("房主("+house.getName()+"): ");
        String name = Utility.readString(10,"");
        if (!"".equals(name)){
            house.setName(name);
        }
        System.out.print("电话("+house.getPhone()+"): ");
        String phone = Utility.readString(12);
        if (!"".equals(phone)){
            house.setPhone(phone);
        }
        System.out.print("地址("+house.getAddress()+"): ");
        String address = Utility.readString(20);
        if (!"".equals(address)){
            house.setAddress(address);
        }
        System.out.print("月租("+house.getRent()+"): ");
        int rent = Utility.readInt();
        if (rent != -1){
            house.setRent(rent);
        }
        System.out.print("状态("+house.getState()+"): ");
        String state = Utility.readString(10);
        if (!"".equals(state)){
            house.setState(state);
        }
        System.out.println("============修改房屋信息成功===========");

    }


    //查找房屋信息，更具编号
    public void searchHouse(){
        System.out.println("==============查找房屋信息=============");
        System.out.print("请输入查找房屋编号: ");
        int searchId = Utility.readInt();
        House house = houseService.search(searchId);
        if (house != null) {
            System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
            System.out.println(house);
        }else {
        System.out.println("===========编号不存在，查找房屋信息失败==========");
        }
    }
    //删除房屋信息界面
    public void delHouse(){
        System.out.print("请选择待删除房屋编号(-1退出): ");
        int delId = Utility.readInt();
        if (delId ==-1){
            System.out.println("==============放弃删除房屋信息=============");
            return;
        }
        char choice =  Utility.readConfirmSelection();
        if (choice == 'Y'){
            if (houseService.del(delId)) {
                System.out.println("==============删除房屋信息成功=============");
            }else{
                System.out.println("==========编号不存在，删除房屋信息失败=========");
            }
        }else{
            System.out.println("==============放弃删除房屋信息=============");
        }
    }


    //添加房屋信息界面
    public void addHouse(){
        System.out.println("================ 添加房屋信息 ================");
        System.out.print("房主：");
        String name = Utility.readString(10);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(20);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(10);
        House newHouse =  new House(0,name,phone,address,rent,state);
        if (houseService.add(newHouse)){
            System.out.println("================ 添加房屋成功 ================");
        }else{
            System.out.println("================ 添加房屋失败 ================");

        }

    }

    //系统退出
    public void exit(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //房屋列表
    public void listHouse(){
        System.out.println("==================房屋信息================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
               break;
            }
            System.out.println(houses[i]);
        }
    }
}
