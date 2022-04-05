package com.hspjava.encap;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("Tom", 5678, "654321");
        System.out.println("是否需要查看 y/n:");
        char Index = scanner.next().charAt(0);
        if (Index == 'y') {
            account.Info();
        }
    }
}
