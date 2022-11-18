package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine 
{
    public void run()
    {
        while(true)
        {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                // display the vending machine slots
            }
            else if(choice.equals("purchase"))
            {
                // make a purchase
            }
            else if(choice.equals("exit"))
            {
                // good bye
                break;
            }
        }
    }
    public static int VendingConverting(String slot) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        char letter = slot.charAt(0);

        int number = Integer.parseInt(slot.substring(1));
        int index = number;
        if (letter == 'A') {
            index += a;
        } else if (letter == 'B') {
            index += b;
        } else if (letter == 'C') {
            index += c;
        } else if (letter == 'D') {
            index += d;
        } else {
            index += -1;
        }
        return index;
    }

    public static void vendingDisplay(VendingMachineHistory history, VendingContents contents) {
        List contentsList = contents.getVendingList();
        boolean isDiscounted = history.getCountOfItemsDispensed() % 2 == 1;
        for (int i = 0; i <contentsList.size() ; i++) {

            VendingItems item = contents.getVendingItem(i);
            String slotNo = item.getSlotNo();
            String name = item.getNameOfProduct();
            if (slotNo != null) {
                int price = item.getPrice(isDiscounted);
                int quantity = item.getQuantity();

                String quantityString;
                if (quantity == 0) {
                    quantityString = "NO LONGER AVAILABLE.";
                } else {
                    quantityString = String.valueOf(quantity);
                }
                System.out.println(slotNo + " " + name + " " + price + " " + quantityString);
            }
        }
    }
    public static void DispenseItem(VendingMachineHistory history, VendingContents contents) {

        Scanner scanner = new Scanner(System.in);
        vendingDisplay(history,contents);
        System.out.println("Enter slot id of selection:");
        String slotSelected = scanner.nextLine();
        int slotPosition = VendingConverting(slotSelected);
//        VendingItems selectedItem = contents.
//        if ()

    }


}
