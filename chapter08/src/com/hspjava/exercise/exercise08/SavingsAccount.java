package com.hspjava.exercise.exercise08;

public class SavingsAccount extends BankAccount {
    private double rate = 0.01;
    private int count = 3;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }



    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);

        } else {
            super.withdraw(amount + 1);
        }
        count --;
    }

    public void earnMonthlyInterest(){
        count = 3;
        super.deposit(getBalance()*rate);
    }
}
