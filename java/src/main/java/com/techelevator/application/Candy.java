package com.techelevator.application;

import java.math.BigDecimal;

public class Candy extends VendingItems {

    public Candy(String slotNo, String nameOfProduct, BigDecimal price) {
        super(slotNo, nameOfProduct, price);
    }

    @Override
    public String dispenseMessage(boolean isDiscount, BigDecimal remainingBalance) {

        System.out.println("Sugar, Sugar, so Sweet!");
        return "Sugar, Sugar, so Sweet!";
    }
}
