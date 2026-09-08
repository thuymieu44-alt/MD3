public class Vehicle {
    protected String name;
    protected int speed;
    public Vehicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void displayInfo() {
        
    }
}
// ---------------------- Car ----------------------
class Car extends Vehicle {

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Name: " + name + ", Speed: " + speed + " km/h");
    }
}
// ---------------------- Bike ----------------------
class Bike extends Vehicle {

    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Name: " + name + ", Speed: " + speed + " km/h");
    }
}
// ---------------------- Main ----------------------
class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 120);
        Vehicle bike = new Bike("Yamaha", 80);

        car.start();
        car.displayInfo();

        bike.start();
        bike.displayInfo();
    }
}
