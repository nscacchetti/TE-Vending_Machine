package com.techelevator.application;

import java.math.BigDecimal;
import java.util.Scanner;

public class Money {

    private BigDecimal remainingBalance = BigDecimal.valueOf(0);

    public Money() {
    }

    public BigDecimal getRemainingBalance() {
        return remainingBalance;
    }

    public BigDecimal spendMoney (BigDecimal cost) {
//        https://stackoverflow.com/questions/34677644/how-to-use-comparison-operators-like-on-bigdecimal
        if (this.remainingBalance.subtract(cost).compareTo(BigDecimal.valueOf(0)) > 0) {
            remainingBalance = this.remainingBalance.subtract(cost);
            return remainingBalance;
        } else {
            System.out.println("Not enough money in balance");
            throw new Error("Low balance");
        }
    }

    public BigDecimal addMoney (BigDecimal inputMoney) {
        
        this.remainingBalance = remainingBalance.add(inputMoney);
        return remainingBalance; 
    }

    public void feedMoney () {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Insert money in whole dollar amounts");
            String dollarsEntered = inputScanner.nextLine();
            try {
                BigDecimal addedDollars = new BigDecimal(Integer.parseInt(dollarsEntered) * 100);
                addMoney(addedDollars);
                System.out.println("current balance: " + remainingBalance+ "cents");
            } catch(Exception e) {

            break;
            }

        }

    }

    public void finishTransaction () {
        int valueOfADollar = 100;
        int valueOfAQuarter = 25;
        int valueOfADime = 10;
        int valueOfANickel = 5;
        int remainingBalanceInt = this.remainingBalance.intValue();
        int changeAfterDollars = remainingBalanceInt % valueOfADollar;
        int dollarCount = (remainingBalanceInt - changeAfterDollars)/valueOfADollar;
        int changeAfterQuarters = remainingBalanceInt % valueOfAQuarter;
        int quarterCount = (remainingBalanceInt - changeAfterQuarters)/valueOfAQuarter;
        int changeAfterDimes = remainingBalanceInt % valueOfADime;
        int dimeCount = (remainingBalanceInt - changeAfterDimes)/valueOfADime;
        int changeAfterNickels = remainingBalanceInt % valueOfANickel;
        int nickelCount = (remainingBalanceInt - changeAfterNickels)/valueOfANickel;

        System.out.println("Change dispensed: " + dollarCount + " dollars, " + quarterCount + " quarters, " + dimeCount + " dimes, " + nickelCount + " nickels");
        this.remainingBalance = BigDecimal.valueOf(0);

    }
}
