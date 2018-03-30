package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//        while (count != 5) {
//            System.out.println("Count value is " + count);
//           count++;
//        }
//        System.out.println("\n");
//
//        int count2 = 0;
//        while(true) {
//            if(count2 ==5) {
//                break;
//            }
//            System.out.println("Count value is " + count2);
//            count2++;
//        }
//        System.out.println("\n");
//
//        int count3 = 0;
//        do {
//            System.out.println("Count value was " + count3);
//            count3++;
//        } while (count3!= 5);
        int number = 5;
        int finishNumber = 20;
        int evenCount = 0;
        while (number <= finishNumber) {
            if (!isEven(number)) {
                number++;
                continue;
            }

            System.out.println("Even number" + number);
            number ++;
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println("The number of even numbers found was " + evenCount);

    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
