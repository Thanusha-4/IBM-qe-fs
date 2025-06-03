package Activities;

public class Activity1 {
    // Variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    // Constructor
    public Activity1(String color, String transmission, int make) {
        this.color = color;
        this.transmission = transmission;
        this.make = make;
        this.tyres = 4;
        this.doors = 4;
    }

    // Method to display characteristics
    public void displayCharacteristics() {
        System.out.println("Color of the car: " + color);
        System.out.println("Transmission of the car: " + transmission);
        System.out.println("Make of the car: " + make);
        System.out.println("Number of tyres: " + tyres);
        System.out.println("Number of doors: " + doors);
    }

    // Method to simulate acceleration
    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

    // Method to simulate braking
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
