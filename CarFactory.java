package java_essential_training;

/**
 * Car Factory Game: Demonstrates Object-Oriented Programming (OOP).
 * It focuses on Classes, Objects, Getters/Setters, and Method Overriding.
 */
public class CarFactory {

    public static void main(String[] args) {
        // Creating car objects using the build method
        Car car1 = buildCar("Toyota", "Camry", 2023, "Silver");
        Car car2 = buildCar("Tesla", "Model 3", 2024, "White");
        Car car3 = buildCar("Toyota", "Camry", 2023, "Silver"); // Duplicate for comparison

        System.out.println("--- Car Factory Production ---");
        System.out.println("Car 1: " + car1.toString());
        System.out.println("Car 2: " + car2.toString());

        // Comparing objects using the overridden equals method
        System.out.println("\n--- Testing Equality ---");
        if (car1.equals(car3)) {
            System.out.println("Success: Car 1 and Car 3 are identical.");
        } else {
            System.out.println("Failure: Car 1 and Car 3 are different.");
        }
    }

    // Static method to demonstrate object creation and property setting
    static Car buildCar(String make, String model, int year, String color) {
        Car car = new Car(make, model);
        car.setYear(year);
        car.setColor(color);
        return car;
    }
}

/**
 * Car Model Class (POJO - Plain Old Java Object)
 */
class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    // Constructor: Defining core attributes
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getters and Setters: Encapsulation best practices
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    // Override toString to provide meaningful object description
    @Override
    public String toString() {
        return String.format("Car [Make: %s, Model: %s, Year: %d, Color: %s]", make, model, year, color);
    }

    // Override equals to compare object content instead of memory address
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return year == car.year &&
                make.equals(car.make) &&
                model.equals(car.model) &&
                color.equals(car.color);
    }
}