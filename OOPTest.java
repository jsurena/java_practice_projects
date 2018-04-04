package com.company;

public class Main {

    public static void main(String[] args) {
	    ClassicBurger order1 = new ClassicBurger("Sesame");
	    order1.addCondiments(1,1,1,1);
	    System.out.println(order1.totalPrice());

	    VeggieBurger order2 = new VeggieBurger("Rye");
	    order2.addCondiments(1,1,1,1,1,1);
	    System.out.println(order2.totalPrice());

	    System.out.println(order2.getAoli());

	    DeluxeBurger order3 = new DeluxeBurger("Sesame");
	    System.out.println(order3.totalPrice());
    }
}
