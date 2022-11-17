package com.techelevator.application;

public class Money {

    private int remainingBalance = 0;

    public Money(int remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public int getRemainingBalance() {
        return remainingBalance;
    }

    public int spendMoney (int cost) {
        if (this.remainingBalance - cost > 0) {
            return this.remainingBalance -= cost;
        } else {
            System.out.println("Not enough money in balance");
            throw new Error("Low balance");
        }
    }

    public int addMoney (int inputMoney) {
        return this.remainingBalance += inputMoney;
    }
}
