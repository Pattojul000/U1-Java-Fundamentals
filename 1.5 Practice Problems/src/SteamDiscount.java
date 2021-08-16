public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {
        double cost = 60.00;

        final double discount = 20.0;
        final double discountCost = discount/100;

        double subtotalCost = cost * discount;
        double totalCost = cost * (1 - discountCost);

        System.out.println(discount);
        System.out.println("The total cost is " + totalCost);

    }
}
