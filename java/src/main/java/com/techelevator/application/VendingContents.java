package com.techelevator.application;

import java.util.ArrayList;
import java.util.List;


public class VendingContents {
    List contentsList = new ArrayList();
    VendingItems toAdd = null;

    public VendingContents() {


    }

    public void add(String slot, VendingItems item) {
        int hex = Integer.parseInt(slot,16);
        this.contentsList.add(hex, item);

    }

    public List getContentsList() {
        return contentsList;
    }
}
