package com.techelevator.application;

public class Drink extends VendingItems {

    public Drink(String slotNo, String nameOfProduct, int price) {
        super(slotNo, nameOfProduct, price);
    }

    @Override
    public String dispenseMessage(boolean isDiscount, int remainingBalance) {
        System.out.println(getNameOfProduct() + " " + getPrice(isDiscount) + " " + remainingBalance);
        System.out.println("Drinky, Drinky, Slurp Slurp!");
        return "Drinky, Drinky, Slurp Slurp!";
    }
}
