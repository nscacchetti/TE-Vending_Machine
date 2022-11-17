package com.techelevator;

import com.techelevator.application.VendingMachine;

public class VendingMachineCLI 
{
    public static void main(String[] args) 
    {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.run();
    }

    /*
        pushing catering/catering1 inside vending machine
        Create classes for: Munchy, Candy, Drink, Gum
            slot no, name of product, price, quantity, BOGODO (price - 1)
            initial quantity = 6
            add item counter


        Display Method:
            if (odd)
                 boolean discountApplies;
            displays each product with the slot no, name, price, quantity
            if quantity is 0 display: "NO LONGER AVAILABLE."
            if discountApplies, then apply BOGODO prices
        Purchase:
            (M) Feed Money: 1, 5, 10, 20
                While more money is left to be added
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
                    run purchase method

            (F) Finish Transaction:
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
