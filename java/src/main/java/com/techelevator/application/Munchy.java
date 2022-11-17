package com.techelevator.application;

public class Munchy extends VendingItems {

    public Munchy(String slotNo, String nameOfProduct, int price) {
        super(slotNo, nameOfProduct, price);
    }

    @Override
    public String dispenseMessage() {
//        System.out.println(getNameOfProduct(), );
        System.out.println("Munchy, Munchy, so Good!");
        return "Munchy, Munchy, so Good!";
    }
}
