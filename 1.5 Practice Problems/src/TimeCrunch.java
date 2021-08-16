public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {
        int number = 4000;

        int hours = number / 3600;
        number = number % 3600;

        int minutes = number / 60;
        number = number % 60;

        int seconds = number;




        System.out.println("Its " + hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println("and " + number + " seconds");


    }



}
