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

    public void finishTransaction () {
        int valueOfADollar = 100;
        int valueOfAQuarter = 25;
        int valueOfADime = 10;
        int valueOfANickel = 5;

        int changeAfterDollars = this.remainingBalance % valueOfADollar;
        int dollarCount = (this.remainingBalance - changeAfterDollars)/valueOfADollar;
        int changeAfterQuarters = this.remainingBalance % valueOfAQuarter;
        int quarterCount = (this.remainingBalance - changeAfterQuarters)/valueOfAQuarter;
        int changeAfterDimes = this.remainingBalance % valueOfADime;
        int dimeCount = (this.remainingBalance - changeAfterDimes)/valueOfADime;
        int changeAfterNickels = this.remainingBalance % valueOfANickel;
        int nickelCount = (this.remainingBalance - changeAfterNickels)/valueOfANickel;

        System.out.println("Change dispensed: " + dollarCount + " dollars, " + quarterCount + " quarters, " + dimeCount + " dimes, " + nickelCount + " nickels");
        this.remainingBalance = 0;

    }
}
