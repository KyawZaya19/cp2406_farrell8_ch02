import java.util.Scanner;
class Eggs
{
    public static void main(String[] args)
    {
        final int DOZEN = 12;
        final double PRICE_PER_DOZEN = 3.25;
        final double PRICE_FOR_INDIVIDUAL = 0.45;
        int eggsOrdered;
        int dozens;
        int eggsLeft;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter eggs ordered >> ");
        eggsOrdered = input.nextInt();
        dozens = eggsOrdered / DOZEN;
        eggsLeft = eggsOrdered % DOZEN;
        total = dozens * PRICE_PER_DOZEN + eggsLeft * PRICE_FOR_INDIVIDUAL;
        System.out.println("You ordered " + eggsOrdered + " eggs. That's " + dozens + " dozen at $" + PRICE_PER_DOZEN + " per dozen and " + eggsLeft + " loose eggs at " + (int)(100 * PRICE_FOR_INDIVIDUAL) + " cents each for a total of $" + total + ".");
    }
}
