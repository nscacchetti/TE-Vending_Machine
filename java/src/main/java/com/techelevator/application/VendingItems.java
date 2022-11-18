package com.techelevator.application;

public class VendingItems {

    private String slotNo;
    private String nameOfProduct;
    private int price;
    private int quantity = 6;
    private int discountPrice;

    public VendingItems(String slotNo, String nameOfProduct, int price) {
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

    public String getSlotNo() {
        return slotNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public String dispenseMessage(boolean isDiscount, int remainingBalance) {
        return null;
    }

    public void dispenseItem() {
        quantity--;
    }
    //    slot no, name of product, price, quantity, BOGODO (price - 1)

}
