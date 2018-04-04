package com.company;

public class VeggieBurger extends ClassicBurger {
    private double burgerPrice;
    private String rollType;
    private String meat;
    private int lettuce;
    private int tomato;
    private int pickles;
    private int onions;
    private int aoli;
    private int carrots;

    public VeggieBurger(String rollType) {
        super(rollType);
        this.rollType = rollType;
        this.meat = "Veggie";
        this.burgerPrice= 6.50;
    }

    public void addCondiments(int lettuce, int tomato, int pickles, int onions, int aoli, int carrots) {
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
        if (aoli == 1) {
            this.burgerPrice += 1;
        }
        if (carrots == 1) {
            this.burgerPrice += .75;
        }
    }

    @Override
    public String totalPrice() {
        if (this.rollType == "Rye")
        {
            return "The total price for this order is " + (this.burgerPrice + .75) + " dollars.";
        } else if (this.rollType == "Brown")
        {
            return "The total price for this order is " + (this.burgerPrice + .5) + " dollars.";
        }
        return "Please put in an order.";
    }

    public double getBurgerPrice() {
        return this.burgerPrice;
    }

    public String getRollType() {
        return rollType;
    }

    @Override
    public String getMeat() {
        return meat;
    }

    @Override
    public int getLettuce() {
        System.out.println("Lettuce is 75 cents.");
        return lettuce;
    }

    @Override
    public int getTomato() {
        System.out.println("Tomatoes are 50 cents.");
        return tomato;
    }

    @Override
    public int getPickles() {
        System.out.println("Pickles are 50 cents.");
        return pickles;
    }

    @Override
    public int getOnions() {
        System.out.println("Onions are 1 dollar.");
        return onions;
    }

    public int getAoli() {
        System.out.println("Aoli is 1 dollar.");
        return aoli;
    }

    public int getCarrots() {
        System.out.println("Carrots are 75 cents.");
        return carrots;
    }
}
