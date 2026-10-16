
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Single Inheritance
class Car extends Vehicle {
    int seats;

    Car(String brand, int speed, int seats) {
        super(brand, speed);
        this.seats = seats;
    }

    void displayCar() {
        displayVehicle();
        System.out.println("Seats: " + seats);
    }
}

// Multilevel Inheritance
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

// Hierarchical Inheritance
class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        System.out.printf("Circle Area: %.2f%n",
                Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        System.out.printf("Rectangle Area: %.2f%n",
                length * width);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("=== Single Inheritance ===");
        Car car = new Car("Toyota", 180, 5);
        car.displayCar();

        // Multilevel Inheritance
        System.out.println("\n=== Multilevel Inheritance ===");
        Manager manager = new Manager("Rahul", 101, "IT");
        manager.displayManager();

        // Hierarchical Inheritance
        System.out.println("\n=== Hierarchical Inheritance ===");
        Circle circle = new Circle(5);
        circle.displayShape();
        circle.calculateArea();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.displayShape();
        rectangle.calculateArea();
    }
}
