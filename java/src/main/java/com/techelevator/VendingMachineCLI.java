package com.techelevator;

import com.techelevator.application.VendingMachine;

import java.util.ArrayList;

public class VendingMachineCLI {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.run();

    }

    public static String displayVending(ArrayList vendingContents) {
        return null;

    }
    /*
        pushing catering/catering1 inside vending machine
        Create classes for: Munchy, Candy, Drink, Gum
            slot no, name of product, price, quantity, BOGODO (price - 1)
            initial quantity = 6
            add item counter
       Audit file./ writer method:
       start writer at main beginning

        void writerMethod(Writer object, String action/item, double transaction amount in dollars, remainingMoney) {

        date = getcurrent date
        time = get current time
        action = action/item
        transaction string = $ transaction amount
        balance = remianing money

        String to wrtire = date+ " "+ time+ " " .........
        use writer to wrtier to file

     }


             use filewriter(or whatever doesnt overwrite the file like printwriter) to append entry to audit.txt
             get current date and time

        Display Method:
            if (odd)
                 boolean discountApplies;
            displays each product with the slot no, name, price, quantity
            if quantity is 0 display: "NO LONGER AVAILABLE."
            if discountApplies, then apply BOGODO prices
        Purchase:
            (M) Feed Money: 1, 5, 10, 20
                While more money is left to be added to remainingMoney
                writerMethod

            (S) Select Item:
                Use display method
                if quantity is 0 display: "NO LONGER AVAILABLE."
                Check is slot exists, check if quantity is 0, then dispense to customer

                Dispense method
                    if discountApplies, then apply BOGODO prices
                    quantity-- and remaining money - cost of item
                    prints: name, cost, remaining money
                        if munchy: "Munchy, Munchy, so Good!"
                        if candy: "Sugar, Sugar, so Sweet!"
                        if drink: "Drinky, Drinky, Slurp Slurp!"
                        if gum: "Chewy, Chewy, Lots O Bubbles!"
                    itemCounter++
                    writerMethod
                    run purchase method

            (F) Finish Transaction:
                    remainingMoney = 3.35

                    changeAfterDollars = remainingMoney % 1 = 0.35
                    dollarCount= (remainingMoney - changeAfterDollars)/1 = (3.35-.35)/1 = 3

                    remainingMoney = 0.35
                    changeAfterDollars = remainingMoney % 0.25 = 0.10
                    quarterCount= (remainingMoney - changeAfterDollars)/0.25 = (0.35-.25)/0.25 = 1

                      remainingMoney = 0.10
                    changeAfterDollars = remainingMoney % 0.10 = 0
                    dimeCount= (remainingMoney - changeAfterDollars)/0.10 = (0.10-0)/0.1 = 1

                      remainingMoney = 0.0
                    changeAfterDollars = remainingMoney % 0.05 = 0
                    nickelCount= (remainingMoney - changeAfterDollars)/0.05 = (0.0-0)/0.05 = 0

                    fedMoney= 0
                  print dollars, quarter, dimes, nickels
                  writerMethod
                    run main to return





                    remaining money % 1
                        remainingMoney = remainingMoney - remaining money % 1
                    remaining money % 0.25
                        remainingMoney = remainingMoney - remaining money % 0.25
                    remaining money % 0.10
                        remainingMoney = remainingMoney - remaining money % 0.10
                    remaining money % 0.05
                        remainingMoney = remainingMoney - remaining money % 0.05
     */

}
