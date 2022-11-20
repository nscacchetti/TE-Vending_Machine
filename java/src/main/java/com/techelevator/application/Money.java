package com.techelevator.application;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Money {

    private BigDecimal remainingBalance = BigDecimal.valueOf(0);
    private Logger logger;

    public Money(Logger logger) {
        this.logger = logger;
    }

    public BigDecimal getRemainingBalance() {
        return remainingBalance;
    }

    public BigDecimal spendMoney(BigDecimal cost) throws Exception {
//        https://stackoverflow.com/questions/34677644/how-to-use-comparison-operators-like-on-bigdecimal
        if (this.remainingBalance.subtract(cost.multiply(BigDecimal.valueOf(100))).compareTo(BigDecimal.valueOf(0)) > 0) {
            remainingBalance = this.remainingBalance.subtract(cost.multiply(BigDecimal.valueOf(100)));
            logger.write("Spent: $" + cost + " Balance: $" + remainingBalance.divide(BigDecimal.valueOf(100)));
            return remainingBalance;
        } else {
            System.out.println("Not enough money in balance");
            logger.write("Not enough money in balance");
            throw new Exception();
        }
    }

    public BigDecimal addMoney(BigDecimal inputMoney) {

        this.remainingBalance = remainingBalance.add(inputMoney);
        return remainingBalance;
    }

    public void feedMoney() {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Insert money in whole dollar amounts");
            String dollarsEntered = inputScanner.nextLine();
            try {
                BigDecimal addedDollars = new BigDecimal(Integer.parseInt(dollarsEntered) * 100);
                addMoney(addedDollars);

                NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
                String moneyString = n.format(remainingBalance.divide(BigDecimal.valueOf(100)));
                logger.write("Current Balance: " + moneyString);
                logger.write("Added Dollars: " + addedDollars.divide(BigDecimal.valueOf(100)));
                System.out.println("Current balance: " + moneyString);
            } catch (Exception e) {

                break;
            }

        }

    }

    public void finishTransaction() {
        int valueOfADollar = 100;
        int valueOfAQuarter = 25;
        int valueOfADime = 10;
        int valueOfANickel = 5;
        int remainingBalanceInt = this.remainingBalance.intValue();
        int changeAfterDollars = remainingBalanceInt % valueOfADollar;
        int dollarCount = (remainingBalanceInt - changeAfterDollars) / valueOfADollar;
        remainingBalanceInt = changeAfterDollars;
        int changeAfterQuarters = remainingBalanceInt % valueOfAQuarter;
        int quarterCount = (remainingBalanceInt - changeAfterQuarters) / valueOfAQuarter;
        remainingBalanceInt = changeAfterQuarters;
        int changeAfterDimes = remainingBalanceInt % valueOfADime;
        int dimeCount = (remainingBalanceInt - changeAfterDimes) / valueOfADime;
        remainingBalanceInt = changeAfterDimes;
        int changeAfterNickels = remainingBalanceInt % valueOfANickel;
        int nickelCount = (remainingBalanceInt - changeAfterNickels) / valueOfANickel;

        System.out.println("Change dispensed: " + dollarCount + " dollars, " + quarterCount + " quarters, " + dimeCount + " dimes, " + nickelCount + " nickels");
        logger.write("Change dispensed: " + dollarCount + " dollars, " + quarterCount + " quarters, " + dimeCount + " dimes, " + nickelCount + " nickels");
        this.remainingBalance = BigDecimal.valueOf(0);
        //https://www.infoworld.com/article/2075315/make-cents-with-bigdecimal.html
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);

        String moneyString = n.format(remainingBalance);
        logger.write("Current Balance: " + moneyString);

    }
}
