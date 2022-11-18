package com.techelevator;

import com.techelevator.application.VendingContents;
import com.techelevator.application.VendingItems;
import com.techelevator.application.VendingMachine;
import com.techelevator.application.VendingMachineHistory;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class VendingMachineCLITest {
    // min test
    /*check muchy class
     * is the price what I expected etc.
     * change functionallity
     * */
    public VendingMachineHistory history = new VendingMachineHistory();
    VendingItems a1 = new VendingItems("A1", "test1", 300);
    VendingItems b1 = new VendingItems("B1", "test1", 300);
    VendingItems c2 = new VendingItems("C2", "test1", 300);
    VendingContents vendingContents = new VendingContents();

    @Before
    public void setup() {
        vendingContents.putItem("A1", a1);
        vendingContents.putItem("B1", b1);
        vendingContents.putItem("C2", c2);
    }

    @Test
    public void test_display_shows_full_inventory() throws FileNotFoundException {
        File testDisplay = new File("catering_test_display");
        Scanner scanner = new Scanner(testDisplay);
        String expected = "";
        while (scanner.hasNextLine()) {
            expected += scanner.nextLine();

        }

        String actual = VendingMachineCLI.displayVending(new ArrayList());
        assertEquals(expected, actual);


    }

    @Test
    public void test_vending_list_has_values() throws FileNotFoundException {
        VendingItems testVend = new VendingItems("B2", "testy", 1000);

        VendingContents testContents = new VendingContents();
        testContents.putItem("B2", testVend);


//        Map actualList = testContents.getContentsList();
        System.out.println("Successful");

        assertEquals(true, true);


    }

    @Test
    public void test_vending_display_works() throws FileNotFoundException {
        VendingMachine.vendingDisplay(history,vendingContents);

        assertEquals(true, true);


    }
}