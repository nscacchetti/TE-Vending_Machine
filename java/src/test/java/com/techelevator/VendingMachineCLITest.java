package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class VendingMachineCLITest {

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


}