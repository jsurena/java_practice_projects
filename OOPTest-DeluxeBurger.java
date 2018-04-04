package com.company;

public class DeluxeBurger {
    private double burgerPrice;
    private String rollType;
    private int meat;
    private int chips;
    private int soda;

    public DeluxeBurger(String rollType) {
        this.rollType = rollType;
        this.meat = 1;
        this.burgerPrice = 6;
        this.chips = 1;
        this.soda = 1;

        if (this.chips == 1 && this.soda == 1) {
            this.burgerPrice += 4;
        }
    }

    public String totalPrice() {
        if (this.rollType == "Regular")
        {
            return "The total price for this order is " + this.burgerPrice + " dollars.";
        } else if (this.rollType == "Sesame")
        {
            return "The total price for this order is " + (this.burgerPrice + .5) + " dollars.";
        }
        return "Please put in an order.";
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public String getRollType() {
        return rollType;
    }

    public int getMeat() {
        return meat;
    }

    public int getChips() {
        return chips;
    }

    public int getSoda() {
        return soda;
    }
}
