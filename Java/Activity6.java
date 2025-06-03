package Activities;

public class Activity6 {
    public static void main(String[] args) {
        // Create a Plane object with max 10 passengers
        Plane6 plane = new Plane6(10);

        // Add passengers
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");

        // Take off
        System.out.println("Take-off time: " + plane.takeOff());

        // Print passengers
        System.out.println("Passengers on board: " + plane.getPassengers());

        // Sleep 5 seconds to simulate flight
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Land the plane
        plane.land();

        // Print landing time
        System.out.println("Landing time: " + plane.getLastTimeLanded());
    }
}

