public class Main {
    public static void main(String[] args){

        // int has a width of 32

        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = myMinValue/2;
        System.out.println("My total = " + myTotal);
        // byte has a width of 8

        byte myByteValue = 10;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("My new byte value = " + myNewByteValue);


        // short has a width of 16
        short myShortValue = 1000;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("My new short value = " + myNewShortValue);

        // long has a width of 64
        long myLongValue = 100_000l;

        byte disbyte = 46;
        short disshort = 460;
        int disint = 46000;
        long dislong = 50000L + 10L * (disbyte + disshort + disint);
        System.out.println("Dis long is " + dislong);
    }
}
