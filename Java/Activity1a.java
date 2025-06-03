package Activities;

public class Activity1a {
    public static void main(String[] args) {
        // Create a Car object
        Activity1 myCar = new Activity1("Red", "Automatic", 2023);

        // Call Car methods
        myCar.displayCharacteristics();
        myCar.accelerate();
        myCar.brake();
    }
}
