package com.techelevator.application;

import java.math.BigDecimal;

public class Gum extends VendingItems {

    public Gum(String slotNo, String nameOfProduct, BigDecimal price) {
        super(slotNo, nameOfProduct, price);
    }

    @Override
    public String dispenseMessage(boolean isDiscount, BigDecimal remainingBalance) {
        System.out.println(getNameOfProduct() + " " + getPrice(isDiscount) + " " + remainingBalance);
        System.out.println("Chewy, Chewy, Lots O Bubbles!");
        return "Chewy, Chewy, Lots O Bubbles!";
    }
}