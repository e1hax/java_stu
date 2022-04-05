package com.hspjava.exercise.exercise08;

public class Test {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.withdraw(100);//取款100
//        checkingAccount.withdraw(100);//取款100
//        checkingAccount.withdraw(100);//取款100
//        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);//存款100，免手续费
        savingsAccount.deposit(100);//存款100，免手续费
        savingsAccount.deposit(100);//存款100，免手续费
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        savingsAccount.deposit(100);//存款100，免手续费
        savingsAccount.deposit(100);//存款100，免手续费
        System.out.println(savingsAccount.getBalance());

    }
}
