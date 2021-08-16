public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */
    public static void main(String[] args) {
        int milesPerHour = 35;
        int minutes = 24;

        double hours = minutes/60.0;

        double distance =  milesPerHour/hours;

        System.out.println("The distance is " + distance + " miles");
    }
}
