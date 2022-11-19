package com.techelevator.application;

import java.math.BigDecimal;

public class VendingItems {

    private String slotNo;
    private String nameOfProduct;
    private BigDecimal price;
    private int quantity = 6;
    private BigDecimal discountPrice;

    public VendingItems(String slotNo, String nameOfProduct, BigDecimal price) {
        this.slotNo = slotNo;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.discountPrice = price.subtract(BigDecimal.valueOf(1));
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public BigDecimal getPrice(boolean discountApplies) {
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

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public String dispenseMessage(boolean isDiscount, BigDecimal remainingBalance) {
        return null;
    }

    public void dispenseItem() {
        quantity--;
    }
    //    slot no, name of product, price, quantity, BOGODO (price - 1)

}
