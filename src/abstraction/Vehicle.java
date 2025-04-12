package abstraction;

public abstract class Vehicle {
    private int number;
    abstract void start();

    void stop(){
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle{

    @Override
    void start() {
        System.out.println("Car started.");
    }
}

class Bike extends Vehicle{

    @Override
    void start() {

    }
}

class Main{
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();

        Vehicle bike = new Bike();
        bike.start();

        car.stop();
        bike.stop();


    }
}
