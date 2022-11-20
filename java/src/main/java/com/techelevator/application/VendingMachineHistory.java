package com.techelevator.application;

public class VendingMachineHistory {

    private int countOfItemsDispensed;


    public int getCountOfItemsDispensed() {
        return countOfItemsDispensed;
    }

    public void setCountOfItemsDispensed(int countOfItemsDispensed) {
        this.countOfItemsDispensed = countOfItemsDispensed;
    }

    public int addCounter () {
        return this.countOfItemsDispensed++;
    }

    public boolean checkDiscount () {
       return countOfItemsDispensed % 2 == 1;
    }



}
