package com.techelevator.application;

public class Munchy extends VendingItems {

    public Munchy(String slotNo, String nameOfProduct, int price, boolean discountApplies) {
        super(slotNo, nameOfProduct, price, discountApplies);
    }

    @Override
    public String dispenseMessage(boolean isDiscount, int remainingBalance) {
        System.out.println(getNameOfProduct() + " " + getPrice(isDiscount) + " " + remainingBalance);
        System.out.println("Munchy, Munchy, so Good!");
        return "Munchy, Munchy, so Good!";
    }
}
