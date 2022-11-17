package com.techelevator;

import com.techelevator.application.VendingContents;
import com.techelevator.application.VendingItems;
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
    @Before
    public void setup(){

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
        VendingItems testVend = new VendingItems("A2", "testy", 1000);

        VendingContents testContents = new VendingContents();
        testContents.add("A2",testVend);


        List expectedList = testContents.getContentsList();
        String expected= (String) expectedList.get(162);
        System.out.println(expected);
        assertEquals(true, true);


    }


}