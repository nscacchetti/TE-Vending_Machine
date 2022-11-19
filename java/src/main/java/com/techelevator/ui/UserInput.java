package com.techelevator.ui;

import com.techelevator.application.Money;
import com.techelevator.application.VendingMachine;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * 
 * Dependencies: None
 */
public class UserInput
{
    private static Scanner scanner = new Scanner(System.in);
    public static String getHomeScreenOption()
    {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Vending Machine Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if (option.equals("D"))
        {
            return "display";
        }
        else if (option.equals("P"))
        {
            return "purchase";
        }
        else if (option.equals("E"))
        {
            return "exit";
        }
        else
        {
            return "";
        }



    }
    public static String getPurchaseScreenOption(Money money)
    {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("M) Feed Money");
        System.out.println("S) Select Item");
        System.out.println("F) Finish Transaction\n");
        BigDecimal moneyBigDecimal = new BigDecimal(money.getRemainingBalance());
        moneyBigDecimal=moneyBigDecimal.divide(BigDecimal.valueOf(100));
//https://www.infoworld.com/article/2075315/make-cents-with-bigdecimal.html
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);

        String moneyString = n.format(moneyBigDecimal);

        System.out.println("Current Money Provided: "+moneyString);

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if (option.equals("M"))
        {
            return "M";
        }
        else if (option.equals("S"))
        {
            return "S";
        }
        else if (option.equals("F"))
        {
            return "F";
        }
        else
        {
            return "";
        }



    }

}
