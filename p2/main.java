public class SingleInheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.showCar();
    }
}

class Vehicle {
    String brand = "Toyota";
    int speed = 180;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int seats = 5;

    void showCar() {
        display();
        System.out.println("Seats: " + seats);
    }
}
