package com.company;

public class ClassicBurger {
    private double burgerPrice;
    private String rollType;
    private String meat;
    private int lettuce;
    private int tomato;
    private int pickles;
    private int onions;

    public ClassicBurger (String rollType) {
        this.rollType = rollType;
        this.meat = "Beef";
        this.burgerPrice = 6;
    }

    public void addCondiments(int lettuce, int tomato, int pickles, int onions) {
        if (lettuce == 1) {
            this.burgerPrice += .75;
        }
        if (tomato == 1) {
            this.burgerPrice += .50;
        }
        if (pickles == 1) {
            this.burgerPrice += .50;
        }
        if (onions == 1) {
            this.burgerPrice += 1;
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
        return this.burgerPrice;
    }
    public String getRollTYpe() {
        return this.rollType;
    }
    public String getMeat() {
        return this.meat;
    }
    public int getLettuce() {
        System.out.println("Lettuce is 75 cents.");
        return this.lettuce;
    }
    public int getTomato() {
        System.out.println("Tomatoes are 50 cents.");
        return this.tomato;
    }
    public int getPickles() {
        System.out.println("Pickles are 50 cents.");
        return this.pickles;
    }
    public int getOnions() {
        System.out.println("Onions are 1 dollar. ");
        return this.onions;
    }
}
