package com.techelevator.application;

import java.util.ArrayList;
import java.util.List;


public class VendingContents {
    List contentsList = new ArrayList();

    public VendingContents(String slot, VendingItems item) {
        int hex = Integer.parseInt(slot,16);
        this.contentsList.add(hex, item);

    }
}
