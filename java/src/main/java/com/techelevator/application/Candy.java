package com.techelevator.application;

public class Candy extends VendingItems {

    public Candy(String slotNo, String nameOfProduct, int price, boolean discountApplies) {
        super(slotNo, nameOfProduct, price, discountApplies);
    }

    @Override
    public String dispenseMessage(boolean isDiscount, int remainingBalance) {
        System.out.println(getNameOfProduct() + " " + getPrice(isDiscount) + " " + remainingBalance);
        System.out.println("Sugar, Sugar, so Sweet!");
        return "Sugar, Sugar, so Sweet!";
    }
}
