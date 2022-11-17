package com.techelevator.application;

public class VendingItems {

    private String slotNo;
    private String nameOfProduct;
    private int price;
    private int quantity = 6;
    private int discountPrice;

    public VendingItems(String slotNo, String nameOfProduct, int price, boolean discountApplies) {
        this.slotNo = slotNo;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.discountPrice = price - 1;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getPrice(boolean discountApplies) {
        if (discountApplies) {
           return discountPrice;
        }
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public String dispenseMessage() {
        return null;
    }

    //    slot no, name of product, price, quantity, BOGODO (price - 1)

}