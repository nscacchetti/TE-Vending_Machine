package com.techelevator.application;

import java.util.ArrayList;
import java.util.List;

import static com.techelevator.application.VendingMachine.VendingConverting;


public class VendingContents {
    List contentsList = new ArrayList();


    VendingItems toAdd = null;
//*********************
//    find different list
    public VendingContents() {
        for (int i = 0; i < 101; i++) {
            VendingItems empty = new VendingItems(null, null, 0);
            contentsList.add(empty);
        }

    }

    public void setItem(String slot, VendingItems item) {

        int index = VendingConverting(slot);
        this.contentsList.set(index, item);

    }

    public List getContentsList() {
        return contentsList;
    }

}
