package com.techelevator.application;

import java.util.Scanner;

import static com.techelevator.ui.UserInput.getHomeScreenOption;

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

    public void feedMoney () {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Insert money in whole dollar amounts");
            String dollarsEntered = inputScanner.nextLine();
            try {
                int addedDollars = Integer.parseInt(dollarsEntered) * 100;
                addMoney(addedDollars);
            } catch(Exception e) {
                getHomeScreenOption();
            }

        }

    }
}
