package com.techelevator.application;

public class Gum extends VendingItems {

    public Gum(String slotNo, String nameOfProduct, int price) {
        super(slotNo, nameOfProduct, price);
    }

    @Override
    public String dispenseMessage(boolean isDiscount, int remainingBalance) {
        System.out.println(getNameOfProduct() + " " + getPrice(isDiscount) + " " + remainingBalance);
        System.out.println("Chewy, Chewy, Lots O Bubbles!");
        return "Chewy, Chewy, Lots O Bubbles!";
    }
}