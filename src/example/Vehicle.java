package example;

// Base class
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Subclass
class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Driving a car");
    }
}

// Factory class that returns a Vehicle
class VehicleFactory {
    Vehicle getVehicle() {
        return new Vehicle();
    }
}

// Child class that overrides getVehicle to return a Car
class CarFactory extends VehicleFactory {
    @Override
    Car getVehicle() { // 👈 Covariant return type (Car is a subclass of Vehicle)
        return new Car();
    }
}

class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory(); // Using parent reference
        Vehicle vehicle = factory.getVehicle();    // Actually returns a Car
        vehicle.drive();  // Output: Driving a car
    }
}

