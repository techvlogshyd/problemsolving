package practice.neetcode.designpatterns;

public class factory {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();
        VehicleFactory bikeFactory = new BikeFactory();

        Vehicle myCar = carFactory.createVehicle();
        Vehicle myTruck = truckFactory.createVehicle();
        Vehicle myBike = bikeFactory.createVehicle();

        myCar.getType();   // "Car"
        System.out.println(myCar.getType());
        myTruck.getType(); // "Truck"
        System.out.println(myTruck.getType());
        myBike.getType();  // "Bike"
        System.out.println(myBike.getType());
    }
}
interface Vehicle {
    String getType();
}

class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

class Bike implements Vehicle {
    @Override
    public String getType() {
        return "Bike";
    }
}

class Truck implements Vehicle {
    @Override
    public String getType() {
        return "Truck";
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    // Write your code here
    @Override
    public Vehicle createVehicle(){
        Vehicle vehicle = new Car();
        return vehicle;
    }
}

class BikeFactory extends VehicleFactory {
    // Write your code here
    @Override
    public Vehicle createVehicle(){
        Vehicle vehicle = new Bike();
        return vehicle;
    }

}

class TruckFactory extends VehicleFactory {
    // Write your code here
    @Override
    public Vehicle createVehicle(){
        Vehicle vehicle = new Truck();
        return vehicle;
    }
}

