package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	byte
	short
	int
	long
	float
	double
	char
	boolean
	 */
	    String myString = "This is a string";
        System.out.println("My string is " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string now is " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        char space = ' ';
        lastString = lastString + space + myInt;
        System.out.println(lastString);
    }
}
