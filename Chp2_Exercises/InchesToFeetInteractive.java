import java.util.Scanner;

class InchesToFeetInteractive
{
    public static void main(String[] args) {
        final int INCHES_IN_A_FOOT = 12;
        int inches;
        int feet;
        int inchesLeft;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter inches >> ");
        inches = input.nextInt();
        feet = inches / INCHES_IN_A_FOOT;
        inchesLeft = inches % INCHES_IN_A_FOOT;
        System.out.println(inches + " inches becomes " + feet + " feet and " + inchesLeft + " inches.");
    }
}
