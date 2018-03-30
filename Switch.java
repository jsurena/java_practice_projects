package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case4:case5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char charValue = 'F';

        switch(charValue) {
            case 'A':
                System.out.println("Was an A");
                break;
            case 'B':
                System.out.println("Was a B");
                break;
            case 'C':
                System.out.println("Was a C");
                break;
            case 'D':
                System.out.println("Was a D");
                break;
            case 'E':
                System.out.println("Was an E");
                break;
            default:
                System.out.println("A, B, C, D or E was not found");
                break;
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");

        }


    }
}
