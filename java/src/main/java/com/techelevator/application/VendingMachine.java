package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

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
}
