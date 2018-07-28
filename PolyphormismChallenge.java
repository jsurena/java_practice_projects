package com.company;

class Car {
    private String model;
    private int engines;
    private int cylinders;
    private int wheels;
    private int seats;
    private int currentSpeed;
    private int currentDirection;

    public Car (String model, int engines, int cylinders, int seats) {
        this.model = model;
        this.engines = engines;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.seats = seats;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void drive(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("This car is driving at " + currentSpeed + " mph at " +
        currentDirection + " degrees.");
    }
    public void accelerate(int rate) {
        this.currentSpeed += rate;
        System.out.println("The car has accelerated to " + currentSpeed + " mph.");
    }

    public void brake() {
        this.currentSpeed = 0;
        System.out.println("The car has stopped moving.");
    }

    public void changeDirection(int direction) {
        this.currentDirection += direction;
        System.out.println("The car is now moving at " + direction + " degrees.");
    }

    public String driverStatement() {
        return "This car has no driver.";
    }

    public String getModel () {
        return this.model;
    }
    public int getEngines() {
        return this.engines;
    }
    public int getCylinders() {
        return this.cylinders;
    }
    public int getWheels() {
        return this.wheels;
    }
    public int getSeats() {
        return this.seats;
    }
}

class Lamborghini extends Car {
    public Lamborghini() {
        super("Aventador", 1, 12, 2);
    }

    @Override
    public String driverStatement() {
        return "Jean is one of the worst drivers on the road, get out of his way if you love yourself" +
                "and your family.";
    }

}

class Porsche extends Car {
    public Porsche () {
        super("911 Carrera", 1, 10, 2);
    }

    @Override
    public String driverStatement() {
        return "Kyle drives like my grandmother, sometimes you just want to ram into him.";
    }

}

class LightningMcQueen extends Car {
    public LightningMcQueen () {
        super("Tristen", 4, 24, 2);
    }

    @Override
    public String driverStatement() {
        return "Ka-chow! Tristen is so wooooooow.";
    }
}
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            Car car = randomCar();
            System.out.println("The selected car is the " + car.getModel());
            System.out.println("Here is what the driver has to say: " +
            car.driverStatement() + "\n");
        }
    }

    public static Car randomCar() {
        int randomCar = (int) (Math.random() * 3) + 1;
        switch(randomCar){
            case 1:
                return new Lamborghini();
            case 2:
                return new Porsche();
            case 3:
                return new LightningMcQueen();
            default:
                return null;
        }
    }
}
