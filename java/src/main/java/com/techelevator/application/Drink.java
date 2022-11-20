package com.techelevator.application;

import java.math.BigDecimal;

public class Drink extends VendingItems {

    public Drink(String slotNo, String nameOfProduct, BigDecimal price) {
        super(slotNo, nameOfProduct, price);
    }

    @Override
    public String dispenseMessage(boolean isDiscount, BigDecimal remainingBalance) {

        System.out.println("Drinky, Drinky, Slurp Slurp!");
        return "Drinky, Drinky, Slurp Slurp!";
    }
}
