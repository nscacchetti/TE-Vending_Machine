package com.techelevator.application;

import com.techelevator.ui.UserOutput;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import static com.techelevator.ui.UserInput.getHomeScreenOption;
import static com.techelevator.ui.UserInput.getPurchaseScreenOption;

public class VendingMachine {
    private String fileLocation;
    private VendingContents contents;
    private VendingMachineHistory history;
    private Logger logger = new Logger("VendingLog.txt");
    private Money money = new Money(logger);


    public VendingMachine(String fileLocation) {
        this.fileLocation = fileLocation;
        try {
            contents = new VendingContents(fileLocation);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        history = new VendingMachineHistory();
        logger.write(vendingDisplay(history,contents));
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

    public static String vendingDisplay(VendingMachineHistory history, VendingContents contents) {
        List contentsList = contents.getVendingList();
        boolean isDiscounted = history.getCountOfItemsDispensed() % 2 == 1;
        for (int i = 0; i < contentsList.size(); i++) {

            VendingItems item = contents.getVendingItemFromList(i);
            String slotNo = item.getSlotNo();
            String name = item.getNameOfProduct();
            if (slotNo != null) {
                BigDecimal price = item.getPrice(isDiscounted);
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
        return null;
    }

    // (S) Select item
    public void DispenseItem(VendingMachineHistory history, Money money, VendingContents contents) {
        Scanner scanner = new Scanner(System.in);
        vendingDisplay(history, contents);
        System.out.println("Enter slot id of selection:");
        String slotSelected = scanner.nextLine();
        int quantityInSlot = 0;
        try {
            quantityInSlot = contents.getVendingItem(slotSelected).getQuantity();
        } catch (Exception e) {
            System.out.println("Slot doesn't exist");
            DispenseItem(history, money, contents);
        }

        if (quantityInSlot <= 0) {
            System.out.println("NO LONGER AVAILABLE.");
            DispenseItem(history, money, contents);
        }

        BigDecimal priceInSlot = contents.getVendingItem(slotSelected).getPrice(history.checkDiscount());

        try {
            money.spendMoney(priceInSlot);
        } catch (Exception e) {
            getHomeScreenOption();
        }
        VendingItems selectedItem = contents.getVendingItem(slotSelected);
        selectedItem.dispenseItem();
        this.logger.write("dispensed 1 "+ contents.getVendingItem(slotSelected).getNameOfProduct() + "for "+ priceInSlot + " remaining balance: "+ money.getRemainingBalance());
        selectedItem.dispenseMessage(history.checkDiscount(), money.getRemainingBalance());
        history.addCounter();
    }

    public VendingContents getContents() {
        return contents;
    }

    public void run() {
        while (true) {
            UserOutput.displayHomeScreen();
            String choice = getHomeScreenOption();

            if (choice.equals("display")) {
                vendingDisplay(history, contents);

                // display the vending machine slots
            } else if (choice.equals("purchase")) {
                purchase();
            } else if (choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }

    public void purchase() {
        {

            String choice = getPurchaseScreenOption(money);

            if (choice.equals("M")) {
                money.feedMoney();

                // display the vending machine slots
            } else if (choice.equals("S")) {
                DispenseItem(history, money, contents);
            } else if (choice.equals("F")) {
                money.finishTransaction();

            }
        }

    }

}
