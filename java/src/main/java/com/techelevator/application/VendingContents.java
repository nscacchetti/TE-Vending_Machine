package com.techelevator.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static com.techelevator.application.VendingMachine.VendingConverting;


public class VendingContents {
    Map<String,VendingItems> contentsMap = new HashMap();


    VendingItems toAdd = null;
//*********************
//    find different list
    public VendingContents(String fileLocation) throws Throwable {
        File dataFile = new File(fileLocation);
        Scanner scanner = new Scanner(dataFile);
        while (scanner.hasNextLine()) {
            String [] stringArray = scanner.nextLine().split(",");
            String slot = stringArray[0];
            String name = stringArray[1];
            int price = Integer.parseInt(stringArray[2]) * 100;
            String foodType = stringArray[3];
            if (foodType.equals("Candy")) {
                Candy vendingItem = new Candy(slot, name, price);
            } else if (foodType.equals("Drink")) {
                Drink vendingItem = new Drink(slot, name, price);
            } else if (foodType.equals("Gum")) {
                Gum vendingItem = new Gum(slot, name, price);
            } else if (foodType.equals("Munchy")) {
                Munchy vendingItem = new Munchy(slot, name, price);
            } else {
                throw new Throwable("no type");
            }
        }
    }

    public void putItem(String slot, VendingItems item) {

        int index = VendingConverting(slot);
        this.contentsMap.put(slot, item);

    }

    public Map<String, VendingItems> getContentsMap() {
        return contentsMap;
    }

    public VendingItems getVendingItemFromList(int position) {
        List list= getVendingList();
        return (VendingItems) list.get(position);
    }

    public VendingItems getVendingItem (String slot) {
        return contentsMap.get(slot);
    }

    public List<VendingItems> getVendingList() {
        List<VendingItems> contents = new ArrayList();

        for (VendingItems value : contentsMap.values()) {
            contents.add(value);

        }
        return contents;

    }



}
