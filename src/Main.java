public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota");
        vehicles[1] = new Truck("Ford");
        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }
        //Task 2
        try {
            SecondClass secondClass = new SecondClass();
            secondClass.Method();
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }

}
// Task 1
class Vehicle {
    private String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public void drive() {
        System.out.println("Brand of vehicle " + brand + " drives");
    }
    public String getBrand() {
        return brand;
    }
}
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    @Override
    public void drive() {
        System.out.println("Car of " + getBrand() + " drives");
    }
}
class Truck extends Vehicle {
    public Truck(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println("Truck of " + getBrand() + " drives");
    }
}
// Task 2
class FirstClass {
}
class SecondClass extends FirstClass {
    public void Method() {
        try {
            FirstClass firstClass = new FirstClass();
            SecondClass secondClass = (SecondClass) firstClass;
        } catch (ClassCastException e) {
            System.out.println("Error!");
        }
    }
}