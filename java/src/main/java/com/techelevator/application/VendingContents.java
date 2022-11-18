package com.techelevator.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.techelevator.application.VendingMachine.VendingConverting;


public class VendingContents {
    Map<String,VendingItems> contentsMap = new HashMap();


    VendingItems toAdd = null;
//*********************
//    find different list
    public VendingContents() {


    }

    public void putItem(String slot, VendingItems item) {

        int index = VendingConverting(slot);
        this.contentsMap.put(slot, item);

    }

    public Map<String, VendingItems> getContentsMap() {
        return contentsMap;
    }

    public VendingItems getVendingItem(int position) {
        List list= getVendingList();
        return (VendingItems) list.get(position);
    }

    public List<VendingItems> getVendingList() {
        List<VendingItems> contents = new ArrayList();

        for (VendingItems value : contentsMap.values()) {
            contents.add(value);

        }
        return contents;

    }



}
