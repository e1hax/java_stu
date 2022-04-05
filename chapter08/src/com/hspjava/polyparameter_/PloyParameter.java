package com.hspjava.polyparameter_;

public class PloyParameter {
    public static void main(String[] args) {
        Manager Tom = new Manager("Tom", 5000, 10000);
        OrdinaryEmployees Jack = new OrdinaryEmployees("Jack", 3000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnual(Tom);
        ployParameter.testWork(Tom);

        ployParameter.showEmpAnnual(Jack);
        ployParameter.testWork(Jack);


    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getName() + "年薪为：" + e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Manager) {
            ((Manager) e).manager();
        } else if (e instanceof OrdinaryEmployees) {
            ((OrdinaryEmployees) e).work();
        } else {
            System.out.println("有误");
        }
    }


}
