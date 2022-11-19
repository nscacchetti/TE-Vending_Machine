package com.techelevator.application;

import java.math.BigDecimal;

public class Munchy extends VendingItems {

    public Munchy(String slotNo, String nameOfProduct, BigDecimal price) {
        super(slotNo, nameOfProduct, price);
    }

    @Override
    public String dispenseMessage(boolean isDiscount, BigDecimal remainingBalance) {
        System.out.println(getNameOfProduct() + " " + getPrice(isDiscount) + " " + remainingBalance);
        System.out.println("Munchy, Munchy, so Good!");
        return "Munchy, Munchy, so Good!";
    }
}
